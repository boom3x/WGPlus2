package de.ur.mi.android.excercises.starter;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Blackboard extends Activity {

  /*  private Button photoButton;
    private GridView gridView;
    private String currentPhotoPath;
    public static final int REQUEST_IMAGE_CAPTURE = 1;
    private Camera camera;
    //private ImageAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackboard);

        photoButton = (Button) findViewById(R.id.imageButton);
        gridView = (GridView) findViewById(R.id.gridView);

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePicture();
            }
        });
    }

    private void takePicture(int requestCode){
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null)
        {File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {}
            if (photoFile != null) {
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(photoFile));
                startActivityForResult(takePictureIntent, requestCode);
            }
        }
    }

    private File createImageFile()throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(imageFileName, ".jpg",storageDir);
        currentPhotoPath = image.getAbsolutePath();
        return image;
    }

    public String getCurrentPhotoPath() {
        return currentPhotoPath;
    }

    private void processPicture(String path) {
        Point imageSize = new Point(getDisplaySize().x / 2, getDisplaySize().y / 2);
        Bitmap image = camera.getScaledBitmap(path, imageSize);

        gridAdapter.addImage(image);
        gridAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            processPicture(camera.getCurrentPhotoPath());
        }
    }

  */
}


