package app.manager.appfonteexternatruetype;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtRiscoRabisco;
    TextView txtMariaLucia;
    Button btnAnjaEliane;

    // Resource assets
    // Nome da pasta com as fontes
    String pasta = "fonts/";
    String fontTTFAzuki = "Azuki.ttf";
    String fontTTFSketchRockwellBold = "SketchRockwell-Bold.ttf";
    String fontTTFCACCHAMP = "CACCHAMP.TTF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMariaLucia =  findViewById(R.id.txtMariaLucia);

        Typeface TTFSketchRockwellBold = Typeface.createFromAsset(getAssets(),
                pasta+fontTTFSketchRockwellBold);
        txtMariaLucia.setTypeface(TTFSketchRockwellBold);

        txtRiscoRabisco =  findViewById(R.id.txtRiscoRabisco);

        Typeface TTFCACCHAMP = Typeface.createFromAsset(getAssets(),
                pasta+fontTTFCACCHAMP);
        txtRiscoRabisco.setTypeface(TTFCACCHAMP);

        btnAnjaEliane =  findViewById(R.id.btnAnjaEliane);

        Typeface TTFAzuki = Typeface.createFromAsset(getAssets(),
                pasta+fontTTFAzuki);
        btnAnjaEliane.setTypeface(TTFAzuki);

    }
}