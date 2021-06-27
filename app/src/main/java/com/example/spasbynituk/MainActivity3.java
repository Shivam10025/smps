package com.example.spasbynituk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    Button btn;
    EditText et;
    Button ctn;
    EditText pt;
    AutoCompleteTextView bt;
    String st,ct , kt;
    private static final String[] COURSE = new String[]{
            "Fluid Mechanics" , "Fluid Mechanics Lab" , "Engineering Geology" , "Engineering Geology Lab" , "Building Materials and Construction Technology" , "Building Materials Testing Lab" , "Environmental Engineering-I" , "Environmental Engineering-I Lab Transportation Engineering" , "Transportation Engineering Lab" , "Surveying" , "Surveying Lab " , "Strength of Materials" , "Geotechnical Engineering-I " , "Geotechnical Engineering Lab" , "Environmental Engineering-II" , "Environmental Engineering-II Lab" , "Structural Analysis" , "Geotechnical Engineering-II" , "Hydrology and Irrigation Engineering " , "Indeterminate Structural Analysis" , "Design of RCC Structure" , "Design of Steel Structures" , "Railway and Airport Engineering" , "Estimation and Costing" , "Minor project" , "Major Project" , "Probability Theory and Statistics" , "Geomatics Engineering" , "Geomatics Engineering Lab " , "Non-Destructive Testing of Materials" , "Non-Destructive Testing of Materials Lab" , "Structural Dynamics" , "Structural Dynamics Lab" , "Design of Hydraulic Structures" , "Rock Engineering" , "Industrial Waste Management" , "Environmental Impact and Risk Assessment" , "Advanced Concrete Design" , "River Mechanics Traffic Engineering" , "Construction Planning and management" , "Advanced Foundation Engineering" , "Design of Prestressed Concrete" , "Structures" , "Urban Water and Environmental Management" , "Advanced Structural Analysis" , "Advanced Highway Engineering" , "Groundwater Engineering Hydraulic and Hydraulic Machines" , "Bridge Engineering" , "Design of Earth Retaining Structures" , "Architectural Planning and Design of Buidings" , "RCC Structures Detailing Lab" , "Applied Mathematics-I" , "Applied Mathematics-II" , "Applied Mathematics-III*" , "Applied Physics" , "Applied Physics Lab" , "Applied Chemistry" , "Applied Chemistry Lab" , "Elementary Mechanical Engineering" , "Elementary Electrical Engineering" , "Elementary Electrical Engineering Lab" , "Basic Electronics Engineering" , "Basic Electronics Engineering Lab" , "Engineering Drawing" , "Engineering Drawing Lab" , "Computer Programming and Problem Solving" , "Computer Programming Lab" , "Mechanical Workshop" , "Environmental Science" , "NCC#" , "NSS#" , "NSO#" , "Sports-I#" , "Sports-II#" , "Community Project" , "Practical Training" , "Probability and Numerical Methods" , "Technical Communication " , "Social Science" , "Data Structures" , "Data Structures Lab" , "Operating Systems" , "Operating Systems Lab" , "Object Oriented Design Programming Lab" , "Design and Analysis of Algorithms" , "Algorithms Lab" , "Computer Networks" , "Computer Networks Lab" , "Software Engineering" , "Software Lab" , "Data Communication" , "Computer Organization" , "Theory of Computation" , "Database Management Systems" , "DBMS Lab" , "Compiler Design" , "Compiler Design Lab" , "Data Science" , "Python Lab" , "Information and Network Security" , "Artificial Intelligence" , "Discrete Mathematics" , "Digital Circuits" , "Digital Circuits Lab" , "Microcontroller and Interfacing" , "Microcontroller and Interfacing Lab" , "Minor Project" ,
            "Major Project" , "Network Security Lab" , "Artificial Intelligence Lab" , "Digital Image Processing " , "Embedded Systems Lab" , "Web Technologies" , "Information Retrieval" , "Neuro-Fuzzy Techniques" , "Computer Graphics " , "Real Time Systems" , "Real Time Systems Lab" , "Cloud Computing" , "Cloud Computing Lab" , "Internet of Things" , "IoT Lab" , "Machine Learning" , "Machine Learning Lab" , "Parallel and Distributed Computing" , "Linux Lab" , "Multimedia Technologies" , "Concepts in Blockchaining" , "Cyber Forensic" , "System Programming" , "Fundamental Algorithms in" , "Computational Biology" , "Digital Communication Systems" , "Digital Communication Systems Lab" , "Information Theory & Coding" , "Embedded System Design" , "Basic Electrical Circuits" , "Basic Electrical Circuits Lab" , "Measurement & Instrumentation" , "Measurement & Instrumentation Lab" , "Electrical Machines I" , "Electrical Machines I Lab" , "Control System" , "Control System Lab" , "Power Electronics " , "Power System I" , "Signals and Systems" ,
            "Analog Circuits" , "Analog Circuit Lab" , "Engineering Electromagnetics" , "Digital Circuits" , "Digital Circuits Lab" , "Electrical Machines II" , "Electrical Machines II Lab" , "Electric Drives" , "Electric Drives Lab" , "Power System II" , "Advanced Power Electronics" , "Power Electronics Lab " , "Switchgear & Protection" , "Switchgear & Protection Lab" , "Linear Integrated Circuits" , "Linear Integrated Circuits Lab "
            , "Microcontroller & Interfacing" , "Microcontroller & Interfacing Lab" , "Minor Project" , "Major Project" , "Computer Control and Automation of Power Systems" , "Discrete Data and Digital Control" , "Power Plant Engineering" , "HVDC" , "Power System Economics and Management" , "System Engineering" , "Pulse Width Modulation for Power Converters" , "Soft Computing Techniques" , "Commissioning and Testing of Electrical Systems" , "Control System Design" , "Electrical Energy System" , "Electrical Distribution System " , "High Voltage Engineering" , "Power Quality Issues & Solutions" , "Electrical Engineering Material" , "Power System Operation and Control" , "Soft Computing Techniques Lab" , "Digital Signal Processing" , "Digital Signal Processing Lab " , "Hardware Description Language" , "Hardware Description Language Lab" , "Linear Algebra" , "Probability Theory & Statistics" , "Robotics" , "Robotics Lab" , "Object Oriented Design" , "Data Structures" , "Data Structures Lab" , "Neuro-Fuzzy Techniques" , "Signals and Systems*" , "Analog Circuits*" , "Analog Circuits Lab*" , "Analog Communication Systems*" , "Analog Communication Systems Lab*" , "Basic Electrical Circuits*" , "Basic Electrical Circuits Lab*" , "Measurement & Instrumentation **" , "E Measurement & Instrumentation Lab**" , "Control System**" , "Control System Lab **" , "Engineering Electromagnetics*" , "Solid State Devices" , "Digital Circuits*" , "Digital Circuits Lab*" , "Linear Integrated Circuits***" , "Linear Integrated Circuits Lab***" , "Digital Signal Processing***" , " Digital Signal Processing Lab ***" , "Microcontroller and Interfacing**" , "Microcontroller and Interfacing Lab**" , "Antenna Theory**" , "Digital Communication Systems**" , "Digital Communication Systems Lab***" , "Microwave Theory and Techniques***" , "Microwave Theory and Techniques Lab***" , "Information Theory & Coding**" , "Wireless Communications" , "Wireless Communications Lab" , "Electronic System Design" , "Electronic System Design Lab" , "Optical Communication Systems" , "Radar Systems" , "Satellite Communication Systems" , "Finite Automata" , "Radio Frequency and Microwave Engineering" , "Embedded System Design" , "Embedded System Design Lab" , "Hardware Description Languages" , "Hardware Description Languages Lab " , "Principles of Biomedical Instrumentation Design" , "Computer Organization" , "Computer Networks Lab" , "Computer Networks" , "Software Lab" , "Artificial Intelligence" , "Artificial Intelligence Lab" , "Database Management Systems" , "DBMS Lab" , "Python Lab" , "Information and Network Security" , "Cloud Computing Lab" , "Neuro-Fuzzy Techniques" , "" , "Probability Theory and Statistics" , "Metrology and SQC" , "Metrology and SQC Lab" , "Operation Research" , "Industrial Engineering" , "Fluid Dynamics" , "Computer Aided Design" , "Computer Aided Design Lab" , "Computer Integrated Manufacturing" , "Mechatronics" , "Mechatronics Lab" , "Gas Turbine and Compressor" , "Quality Assurance" , "Robotics" , "Robotics Lab" , "Automation in Production" , "Power Plant Engineering" , "Renewable Energy Sources" , "Automobile Engineering" , "Automobile Engineering Lab" , "IC Engine" , "IC Engine Lab" , "Tool Design" , "Machine Tool Design" , "Material Resource Planning" , "Computer Integrated Manufacturing" , "Machine System Design Lab" , "Mechanical Behaviour of Materials" , "Engineering Thermodynamics" , "Fluid Mechanics" , "Fluid Mechanics Lab" , "Solid Mechanics" , "Solid Mechanics Lab" , "Kinematics of Machines" , "Machine Drawing" , "Machine Drawing Lab" , "Casting Welding and Forming " , "Casting Welding and Forming Lab" , "Machining and Machine Tools" , "Machining and Machine Tools Lab" , "Energy Conversion Techniques" , "Energy Conversion Techniques Lab" , "Fluid Machines" , "Fluid Machines Lab" , "Heat and Mass Transfer" , "Heat and Mass Transfer Lab " , "Dynamics of Machines" , "Dynamics of Machines Lab" , "Measurement and Control" , "Measurement and Control Lab " , "Operations Management" , "Design of Machine Elements" , "Refrigeration & Air Conditioning" , "Refrigeration & Air Conditioning Lab" , "Mechanical Vibrations" , "Mechanical Vibrations Lab" , "" , "" ,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();
        AutoCompleteTextView edittext = findViewById(R.id.etmal5);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , COURSE);
        edittext.setAdapter(adapter);
        btn = findViewById(R.id.button7);
        et = findViewById(R.id.etmail5);
        ctn = findViewById(R.id.button8);
        bt = findViewById(R.id.etmal5);
        pt = findViewById(R.id.etml5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this  , Secondary.class);
                st = et.getText().toString();
                st = st.toUpperCase();
                i.putExtra("Value" , st);
                startActivity(i);
                finish();
            }
        });
        ctn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this  , Three.class);
                ct = bt.getText().toString();
                kt = pt.getText().toString();
                kt = kt.toUpperCase();
                String k , p , q;
                k=ct;
                p = ct.concat("-");
                q = p.concat(kt);
                i.putExtra("Value" , q);
                startActivity(i);
                finish();
            }
        });
    }
}