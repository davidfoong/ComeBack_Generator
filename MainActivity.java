package alcamech.comeback;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Random;

public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.alcamech.ComeBack.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void genMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);

        if(randomInt == 0)
        {
           String message =("test");
           intent.putExtra(EXTRA_MESSAGE, message);
           startActivity(intent);
        }
        if(randomInt == 1)
        {
            String message =("test 1");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        if(randomInt == 2)
        {
            String message =("test 2");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        if(randomInt == 3)
        {
            String message =("test 3");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        if(randomInt == 4)
        {
            String message =("test 4");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        if(randomInt == 5)
        {
            String message =("test 5");
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

    }
}
