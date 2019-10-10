package carmel.bootcamp.jsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = (TextView) findViewById(R.id.textView);

        String strJson="{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Dinesh Suresh Oswal\",\"salary\":\"50000\"},{\"id\":\"102\",\"name\":\"Virat Kohli\",\"salary\":\"60000\"}] }";

        String data = "";
        try {
            // Create the root JSONObject from the JSON string.
            JSONObject  jsonRootObject = new JSONObject(strJson);

            //Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");

            //Iterate the jsonArray and print the info of JSONObjects
            for(int i=0; i < jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                int id = Integer.parseInt(jsonObject.optString("id").toString());
                String name = jsonObject.optString("name").toString();
                float salary = Float.parseFloat(jsonObject.optString("salary").toString());

                data += "Node"+i+" : \n id= "+ id +" \n Name= "+ name +" \n Salary= "+ salary +" \n ";
            }
            output.setText(data);
        } catch (JSONException e) {e.printStackTrace();}

        TextView output1= (TextView) findViewById(R.id.textView2);
        String strJson1="{ \"Employee\" :[{\"id\":\"101\",\"name\":\"Dinesh\",\"salary\":\"50000\"},{\"id\":\"102\",\"name\":\"Virat\",\"salary\":\"60000\"}] }";

        String data1 = "";
        try {
            // Create the root JSONObject from the JSON string.
            JSONObject  jsonRootObject1 = new JSONObject(strJson1);

            //Get the instance of JSONArray that contains JSONObjects
            JSONArray jsonArray1 = jsonRootObject1.optJSONArray("Employee");

            //Iterate the jsonArray and print the info of JSONObjects
            for(int i=0; i < jsonArray1.length(); i++){
                JSONObject jsonObject1 = jsonArray1.getJSONObject(i);

                int id = Integer.parseInt(jsonObject1.optString("id").toString());
                String name1 = jsonObject1.optString("name").toString();
                float salary1 = Float.parseFloat(jsonObject1.optString("salary").toString());

                data1 += "Node"+i+" : \n id= "+ id +" \n Name= "+ name1 +" \n Salary= "+ salary1 +" \n ";
            }
            output1.setText(data1);
        } catch (JSONException e) {e.printStackTrace();}



    }
}
