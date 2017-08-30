package de.ur.mi.android.excercises.starter;

import android.os.AsyncTask;



public abstract class BackgroundTask extends AsyncTask<Integer,Integer,Double> {

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    protected void onPostExecute(Double result){

        //
        super.onPostExecute(result);
    }

    protected Double doInBackground(Integer... params){
        double x = 0;
        for (int i = 0; i < 3; i++){
            {
                x = Math.sqrt(params[0]);
                publishProgress(i);
            }
        }
        return x;
    }
}
