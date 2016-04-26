package delon.com.br.exemploqualidade;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText mEdtNumero;
    private Button mBtnVerifica;
    private TextView mTxvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mEdtNumero = (EditText) findViewById(R.id.content_main_edt_numero);
        mBtnVerifica = (Button) findViewById(R.id.content_main_btn_verifica);
        mTxvResultado = (TextView) findViewById(R.id.content_main_txv_resultado);

        mBtnVerifica.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.content_main_btn_verifica:
                if (!TextUtils.isEmpty(mEdtNumero.getText())) {
                    exibirResultado(Primo.isPrimo(Integer.parseInt(mEdtNumero.getText().toString())));
                    //Primo.testeMaluco();
                }
                break;

            default:
                break;
        }
    }

    private void exibirResultado(boolean ehPrimo) {
        if (ehPrimo)
            mTxvResultado.setText(R.string.mensagem_eh_primo);
         else
            mTxvResultado.setText(R.string.mensagem_nao_eh_primo);
    }
}
