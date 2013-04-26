package com.morenos.jedit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
//import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class VentanasActivity extends Activity{
	
	private ObtenerFotos gal;
	Context context;
	public RelativeLayout vistaIcono;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_imagen);
        
        Spinner spinner = (Spinner) findViewById(R.id.listaEfectos);
        vistaIcono = (RelativeLayout)findViewById(R.id.icono); 

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.efectos_array, R.layout.spinner_item);
        
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        gal = new ObtenerFotos();
        gal.execute();
        
    }
	
	public class ObtenerFotos extends AsyncTask<Integer, Integer, List<Object>>{
		
		@Override
		protected void onPreExecute() {
			Toast.makeText(VentanasActivity.this, "Empieza", Toast.LENGTH_SHORT).show();
    	}
		
		@Override
		protected List<Object> doInBackground(Integer... urls) {
			/**File dir = new File(Environment.DIRECTORY_PICTURES);
			File[] fileListOrigen = dir.listFiles();			
			List<Object> fileList = new ArrayList<Object>();
					
		    for (File f : fileListOrigen){
		    	
		    	fileList.add(f);	
		    	Log.i("Esto","Es"+f);
		    }
		    
		    return fileList;**/
			return null;
		}
		
		protected void onPostExcecute(List<Object> result){	
			Toast.makeText(VentanasActivity.this, "Listoooo", Toast.LENGTH_SHORT).show();
		}
	}
	
	/*public class ObtenerFotos extends AsyncTask<Integer, Integer, List<Object>>{
		
		@Override
		protected void onPreExecute() {
			Toast.makeText(VentanasActivity.this, "Empieza", Toast.LENGTH_SHORT).show();
    	}
		
		@Override
		protected List<Object> doInBackground(Integer... arg0) {

			Toast.makeText(VentanasActivity.this, "En proceso", Toast.LENGTH_SHORT).show();
			*//**File dir = new File(Environment.DIRECTORY_PICTURES);
			File[] fileListOrigen = dir.listFiles();			
			List<Object> fileList = new ArrayList<Object>();
					
		    for (File f : fileListOrigen){
		    	
		    	fileList.add(f);	
		    	Log.i("Esto","Es"+f);
		    }
		    
		    return fileList;
		    **//*
			return null;
		}
		
		protected void onPostExcecute(List<Object> result){	
			Toast.makeText(VentanasActivity.this, "Listoooo", Toast.LENGTH_SHORT).show();
			*//**ImageView[] icon_thumb = new ImageView[15];

	        for (int i = 0;i < 15; i++) {
	            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
	                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
	            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
	            
	            String descripcion = " ";
	            Drawable imagenDraw = (Drawable) fotos[i];
	            icon_thumb[i] = new ImageView(context);
	            icon_thumb[i].setImageDrawable(imagenDraw);
	            icon_thumb[i].setId(i + 1);
	            icon_thumb[i].setClickable(true);
	            icon_thumb[i].setTag(descripcion);
	            icon_thumb[i].setPadding(0, 0, 2, 0);
	            
	            if (i > 0) {
	                params.addRule(RelativeLayout.BELOW, icon_thumb[i - 1].getId());
	            }else{
	            	icon_thumb[i].setBackgroundColor(0xFFFFC928);
	            }
	            
	            vistaIcono.addView(icon_thumb[i], params);
				
	        }
	        **//*
		}
	}*/
}

