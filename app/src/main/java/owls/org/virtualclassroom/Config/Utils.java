package owls.org.virtualclassroom.Config;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Utils {
    public static Drawable loadImageFromWebOperations(String url) {
        try {
            InputStream URLcontent = (InputStream) new URL(url).getContent();
            Drawable image = Drawable.createFromStream(URLcontent, "your source link");

            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
