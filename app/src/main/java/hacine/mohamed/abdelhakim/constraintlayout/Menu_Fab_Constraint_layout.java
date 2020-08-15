package hacine.mohamed.abdelhakim.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Menu_Fab_Constraint_layout extends AppCompatActivity {
    FloatingActionButton menu , taxi , bus , tram ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_menu_fab);
         menu = findViewById(R.id.menu);
         bus = findViewById(R.id.bus) ;
         taxi = findViewById(R.id.taxi) ;
         tram = findViewById(R.id.tram) ;
         final Group group=(Group)findViewById(R.id.group); //bind view from xml

/*   u can implement clicks on FABs as u like with fragments or activities


 u can add as mach fab as u want but take care of Group and constraints thats all  */




    menu.setOnClickListener(new View.OnClickListener() {

    boolean isPressed = false;
    @Override
    public void onClick(View v) {

       group.setVisibility(isPressed ? View.VISIBLE : View.GONE);
        isPressed = !isPressed;

    }
});
    }
}