package net.androidbootcamp.abc;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3,button4, button5, button6, button7, button8, button9,button10,
            button11, button12, button13,button14, button15, button16, button17, button18, button19,button20,
             button21, button22, button23,button24, button25, button26;


    MainActivity thisMainActivity;

    private static AudioPlayer m_player=new AudioPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thisMainActivity = this;

        button0 = (Button) findViewById(R.id.btnSmall);
        button1 = (Button) findViewById(R.id.btnA);
        button2 = (Button) findViewById(R.id.btnB);
        button3 = (Button) findViewById(R.id.btnC);
        button4 = (Button) findViewById(R.id.btnD);
        button5 = (Button) findViewById(R.id.btnE);
        button6 = (Button) findViewById(R.id.btnF);
        button7 = (Button) findViewById(R.id.btnG);
        button8 = (Button) findViewById(R.id.btnH);
        button9 = (Button) findViewById(R.id.btnI);
        button10 = (Button) findViewById(R.id.btnJ);
        button11 = (Button) findViewById(R.id.btnK);
        button12 = (Button) findViewById(R.id.btnL);
        button13 = (Button) findViewById(R.id.btnM);
        button14 = (Button) findViewById(R.id.btnN);
        button15 = (Button) findViewById(R.id.btnO);
        button16 = (Button) findViewById(R.id.btnP);
        button17 = (Button) findViewById(R.id.btnQ );
        button18 = (Button) findViewById(R.id.btnR);
        button19 = (Button) findViewById(R.id.btnS);
        button20 = (Button) findViewById(R.id.btnT);
        button21 = (Button) findViewById(R.id.btnU);
        button22= (Button) findViewById(R.id.btnV);
        button23= (Button) findViewById(R.id.btnW);
        button24 = (Button) findViewById(R.id.btnX);
        button25 = (Button) findViewById(R.id.btnY);
        button26 = (Button) findViewById(R.id.btnZ);

        button0.setOnClickListener(btn0ls);
        button1.setOnClickListener(btn1ls);
        button2.setOnClickListener(btn2ls);
        button3.setOnClickListener(btn3ls);
        button4.setOnClickListener(btn4ls);
        button5.setOnClickListener(btn5ls);
        button6.setOnClickListener(btn6ls);
        button7.setOnClickListener(btn7ls);
        button8.setOnClickListener(btn8ls);
        button9.setOnClickListener(btn9ls);
        button10.setOnClickListener(btn10ls);
        button11.setOnClickListener(btn11ls);
        button12.setOnClickListener(btn12ls);
        button13.setOnClickListener(btn13ls);
        button14.setOnClickListener(btn14ls);
        button15.setOnClickListener(btn15ls);
        button16.setOnClickListener(btn16ls);
        button17.setOnClickListener(btn17ls);
        button18.setOnClickListener(btn18ls);
        button19.setOnClickListener(btn19ls);
        button20.setOnClickListener(btn20ls);
        button21.setOnClickListener(btn21ls);
        button22.setOnClickListener(btn22ls);
        button23.setOnClickListener(btn23ls);
        button24.setOnClickListener(btn24ls);
        button25.setOnClickListener(btn25ls);
        button26.setOnClickListener(btn26ls);


    }

       Button.OnClickListener btn0ls = new Button.OnClickListener() {
           @Override
           public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, small.class));
            }
        };


    Button.OnClickListener btn1ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.asound);
        }
    };

    Button.OnClickListener btn2ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.bsound);
        }
    };


    Button.OnClickListener btn3ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.csound);
        }
    };
    Button.OnClickListener btn4ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.dsound);
        }
    };
    Button.OnClickListener btn5ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.esound);
        }
    };

    Button.OnClickListener btn6ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.fsound);
        }
    };
    Button.OnClickListener btn7ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.gsound);

        }
    };
    Button.OnClickListener btn8ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.hsound);

        }
    };

    Button.OnClickListener btn9ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.isound);

        }
    };
    Button.OnClickListener btn10ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.jsound);

        }
    };
    Button.OnClickListener btn11ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.ksound);
        }
    };

    Button.OnClickListener btn12ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.lsound);

        }
    };


    Button.OnClickListener btn13ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.msound);

        }
    };
    Button.OnClickListener btn14ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.nsound);

        }
    };
    Button.OnClickListener btn15ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.osound);

        }
    };

    Button.OnClickListener btn16ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.psound);

        }
    };
    Button.OnClickListener btn17ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.qsound);

        }
    };
    Button.OnClickListener btn18ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.rsound);

        }
    };

    Button.OnClickListener btn19ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.ssound);

        }
    };
    Button.OnClickListener btn20ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.tsound);

        }
    };

    Button.OnClickListener btn21ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.usound);
        }
    };

    Button.OnClickListener btn22ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.vsound);
        }
    };


    Button.OnClickListener btn23ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.wsound);
        }
    };
    Button.OnClickListener btn24ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.xsound);
        }
    };
    Button.OnClickListener btn25ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.ysound);
        }
    };

    Button.OnClickListener btn26ls = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            m_player.play(thisMainActivity.getApplicationContext(), R.raw.zsound);
        }
    };


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


}
