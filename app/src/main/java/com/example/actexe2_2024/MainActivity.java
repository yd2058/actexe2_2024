package com.example.actexe2_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener  {
    String[] regions = {"Pick your Mainland","Europe","Asia","Africa","North America","South America","Oceania"},emp={};
    String[][][] dict={{{"Finland","Denmark","Norway","Sweden","Iceland","Faroe Islands","Germany"},{"Helsinki","Copenhagen","Oslo","Stockholm","Reykjavik","Tórshavn","Berlin"},{"5.6mil","5.9mil","5.5mil","10.5mil","380k","54k","83.3mil"},{"Finnish","Danish","Norwegian","Swedish","Icelandic","Faroese","German"},{"Maamme","Der er et yndigt land","Ja, vi elsker dette landet","Du gamla, du fria","Ó, guð vors lands","Tú alfagra land mítt","Deutschlandlied"}}, {{"Sri Lanka","Brunei","Bhutan","Cyprus","Bangladesh","Armenia","Bahrain"},{"Colombo","Bandar Seri Begawan","Thimphu","Nicosia","Dhaka","Yerevan","Manama"},{"22mil","460k","727k","1.2mil","169.4mil","2.7mil","1.8mil"},{"Sinhala","Malay","Dzongkha","Greek","Bengali","Armenian","Arabic"},{"Sri Lanka Matha","Allah Peliharakan Sultan","Druk Tsenden","Hymn to Liberty","Amar Sonar Bangla","Mer Hayrenik","Bahrainona"}}, {{"Ceuta","Cape Verde","Gabon","Chad","malawi","Eritrea","Comoros"},{"N/A","Paria","Liberville","N'Djamena","Lilongwe","Asmara","Moroni"},{"84.8k","588k","2.3mil","17.2mil","19.9mil","3.6mil","821.6k"},{"Spanish","Portuguese","French","French","English","Tigrinya","Comorian"},{"Himno de Ceuta","Cântico da Liberdade","La Concorde","La Tchadienne","Mlungu dalitsani Malaŵi","Eritrea, Eritrea, Eritrea","Udzima wa ya Masiwa"}}, {{"Curaçao","Belize","Saba","Canada","Nueva Esparta","El Salvador", "Cuba"},{"Willemstad","Belmopan","The Bottom","Ottawa","La Asunción","San Salvador","Havana"},{"152.3k","400k","1.9k","40mil","491k","6.3k","11.3mil"},{"Papiamento","English","Dutch","English","Spanish","Spanish","Spanish"},{"Himno di Kòrsou","Land Of The Free","Saba, you rise from the ocean","O Canada","Himno del Estado Nueva Esparta","Himno Nacional de El Salvado","El Himno de Bayamo"}}, {{"Ecuador","Guyana","Paraguay","Bolivia","Suriname","Falkland Islands","Venezuela"},{"Quito","Georgetown","Asunción","La Paz","Paramaribo","Stanley","Caracas"},{"17.8mil","804.5k","6.7mil","12mil","613k","2.8k","29mil"},{"Spanish","English","Paraguayan Guarani","Spanish","Dutch","English","Spanish"},{"¡Salve, Oh Patria!","Green Land of Guyana","Tetã Paraguái Momorãhéi","Bolivianos, el Hado Propicio","God zij met ons Suriname","God Save the King","Gloria al Bravo Pueblo"}}, {{"Tuvalu","Kiribati","Nauru","Solomon Islands"," Vanuatu","Niue","Tonga"},{"Funafuti","Tarawa","Yaren","Honiara","Port Vila","Alofi","Nuku'alofa"},{"11k","128k","12.5k","707.8k","319k","2k","106k"},{"Tuvaluan","English","Nauruan","English","Bislama","English","tongan"},{"Tuvalu mo te Atua","Kunan Kiribati","Nauru Bwiema","God Save Our Solomon Islands","Yumi, Yumi, Yumi","Ko e Iki he Lagi","Ko e fasi ʻo e tuʻi ʻo e ʻOtu Tonga"}}};
    Spinner region;
    ListView count;
    TextView tvcap, tvpop, tvlang, tvant;
    int tran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        region = (Spinner)findViewById(R.id.region);
        count = findViewById(R.id.count);
        tvcap = findViewById(R.id.tvcap);
        tvpop = findViewById(R.id.tvpop);
        tvlang = findViewById(R.id.tvlang);
        tvant = findViewById(R.id.tvant);

        region.setOnItemSelectedListener(this);
        ArrayAdapter<String> regadp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, regions);
        region.setAdapter(regadp);

        count.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tvcap.setText("Capital");
        tvpop.setText("Population size");
        tvlang.setText("Official Language");
        tvant.setText("National Anthem");
        if(position==0){
            ArrayAdapter<String> couadp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, emp);
            count.setAdapter(couadp);
            tran = 0;
        }
        else{
            tran = position-1;
            ArrayAdapter<String> couadp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dict[position-1][0]);
            count.setAdapter(couadp);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        tvcap.setText(dict[tran][1][position]);
        tvpop.setText(dict[tran][2][position]);
        tvlang.setText(dict[tran][3][position]);
        tvant.setText(dict[tran][4][position]);
    }
}