package adiel.rectrain.dialogs;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import adiel.rectrain.R;

public class CustomAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);
    }

    public void showDialog(View view) {
        DialogFragment dialogFragment = new FireMissilesDialogFragment();
        dialogFragment.show(getSupportFragmentManager(),"aaaa");
    }

    public void showDialg2(View view) {
        DialogFragment dialogFragment = new DialogWithLayout();
        dialogFragment.show(getSupportFragmentManager(),"dfsd");
    }
}
/*Right click on res folder, choose New --> Android resource file, set the same name for the new file "styles",
in Available qualifiers: choose the last item "Version" and finally set "Platform API level" 21. */