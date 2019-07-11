package com.example.fitcometv3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class MaxBP_Fragment extends Fragment {
    View myView;
    Button Button_ZatwierdBP;
    EditText EditText_MaxBp;
    TextView proc100,proc90,proc75,proc50;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.maxbp_layout, container, false);
        Button_ZatwierdBP = myView.findViewById(R.id.ZatwierdBP);
        EditText_MaxBp = myView.findViewById(R.id.rekordbpedittext);
        proc100=myView.findViewById(R.id.procent100);
        proc90=myView.findViewById(R.id.procent90);
        proc75=myView.findViewById(R.id.procent75);
        proc50=myView.findViewById(R.id.procent50);
        Button_ZatwierdBP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(EditText_MaxBp.getText().toString())<20){Toast.makeText(getActivity(), "Wartosc Musi byc wieksza niż waga sztangi!", Toast.LENGTH_SHORT).show();}
                if(EditText_MaxBp.getText().toString().isEmpty()){Toast.makeText(getActivity(), "Wprowadz wartosc !", Toast.LENGTH_SHORT).show();}
                else{Toast.makeText(getActivity(), "Zaaktualizowano Rekord !", Toast.LENGTH_SHORT).show();
                    //
                    Barfillremover();

                    String EditText_Value_MaxBP=EditText_MaxBp.getText().toString();
                    double DoubleValueMaxBP=Double.parseDouble(EditText_Value_MaxBP);
                 //   TableFill(DoubleValueMaxBP);
                    Barfill(DoubleValueMaxBP);
                    //

                }//end else
            }
        });

        return myView;
    }


    public void Barfill(double WagaWpisana){
        double WagaAktualna;
        TextView TvBPMaxHalf = myView.findViewById(R.id.maxbphalf);
        TextView TvBPMax = myView.findViewById(R.id.maxbp);
        WagaAktualna = (WagaWpisana-20)/2;
        TvBPMax.setText(String.valueOf(WagaWpisana));
        TableFill(WagaWpisana);

        if (WagaAktualna == 0) {
            TvBPMax.setText("0KG");
            TvBPMaxHalf.setText("0KG");
        }
        else if (WagaAktualna >= 25) {

            myView.findViewById(R.id.pierwszy_red_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-25;

            //Toast.makeText(getActivity(), String.valueOf(WagaAktualna), Toast.LENGTH_SHORT).show();
            //dodac ifa 25 i dodac do ifa 20 elsa
            if (WagaAktualna >= 20) {

               // Toast.makeText(getActivity(), "", Toast.LENGTH_SHORT).show();

                myView.findViewById(R.id.drugi_blue_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-20;

                if (WagaAktualna== 2.5) {
                    WagaAktualna=WagaAktualna-2.5;
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }//if 0.5
                    }//if 1.25
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }//if 2.5
                else  if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;

                    }//if 0.5
                }//if 1.25
                else   if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5
            }
            else    if (WagaAktualna == 15) {

                myView.findViewById(R.id.drugi_yellow_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-15;
                if (WagaAktualna == 2.5) {
                    WagaAktualna=WagaAktualna-2.5;
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }//if 0.5
                    }//if 1.25
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }//if 2.5
                else if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }//if 0.5
                }//if 1.25
                else if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5

            }
            else    if (WagaAktualna == 10) {

                myView.findViewById(R.id.drugi_green_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-10;
                if (WagaAktualna == 5) {
                    WagaAktualna=WagaAktualna-5;
                    if (WagaAktualna == 2.5) {
                        WagaAktualna=WagaAktualna-2.5;
                        if (WagaAktualna == 1.25) {
                            WagaAktualna=WagaAktualna-1.25;
                            if (WagaAktualna == 0.5) {
                                WagaAktualna=WagaAktualna-0.5;
                            }//if 0.5
                        }//if 1.25
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }
                    }//if 2.5
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;

                        }
                    }
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }//if 5kg
                if (WagaAktualna == 2.5) {
                    WagaAktualna=WagaAktualna-2.5;
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }//if 0.5
                    }//if 1.25
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }//if 2.5
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }//if 0.5
                }//if 1.25
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5

            }//if 10kg
            else    if (WagaAktualna == 5) {

                myView.findViewById(R.id.trzeci_white_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-5;
                if (WagaAktualna == 2.5) {
                    WagaAktualna=WagaAktualna-2.5;
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }
                    }
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;

                    }
                }
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }
            else     if (WagaAktualna == 2.5) {

                myView.findViewById(R.id.trzeci_black_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-2.5;
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }

            }
            else     if (WagaAktualna == 1.25) {

                myView.findViewById(R.id.trzeci_dgrey_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }
            else     if (WagaAktualna == 0.5) {
                TvBPMaxHalf.setText(String.valueOf(WagaAktualna));
                myView.findViewById(R.id.trzeci_grey_ele).setVisibility(View.VISIBLE);
                WagaAktualna=WagaAktualna-0.5;
            }

        }//end 25kg
        else if (WagaAktualna == 20) {
            myView.findViewById(R.id.pierwszy_blue_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-20;
            if (WagaAktualna == 2.5) {
                WagaAktualna=WagaAktualna-2.5;
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }//if 0.5
                }//if 1.25
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }//if 2.5
            if (WagaAktualna == 1.25) {
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5
            }//if 1.25
            if (WagaAktualna == 0.5) {

            }//if 0.5
        }//end 20
        else if (WagaAktualna == 15) {
            myView.findViewById(R.id.pierwszy_yellow_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-15;
            if (WagaAktualna == 2.5) {
                WagaAktualna=WagaAktualna-2.5;
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }//if 0.5
                }//if 1.25
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }//if 2.5
            else  if (WagaAktualna == 1.25) {
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5
            }//if 1.25
            else if (WagaAktualna == 0.5) {
                WagaAktualna=WagaAktualna-0.5;
            }//if 0.5

        }
        else  if (WagaAktualna == 10) {
            myView.findViewById(R.id.pierwszy_green_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-10;
            if (WagaAktualna == 5) {
                WagaAktualna=WagaAktualna-5;
                if (WagaAktualna == 2.5) {
                    WagaAktualna=WagaAktualna-2.5;
                    if (WagaAktualna == 1.25) {
                        WagaAktualna=WagaAktualna-1.25;
                        if (WagaAktualna == 0.5) {
                            WagaAktualna=WagaAktualna-0.5;
                        }//if 0.5
                    }//if 1.25
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }//if 2.5
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }//if 5kg
            else  if (WagaAktualna == 2.5) {
                WagaAktualna=WagaAktualna-2.5;
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }//if 0.5
                }//if 1.25
                else   if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }//if 2.5
            else   if (WagaAktualna == 1.25) {
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }//if 0.5
            }//if 1.25
            else  if (WagaAktualna == 0.5) {
                WagaAktualna=WagaAktualna-0.5;
            }//if 0.5

        }//if 10kg
        else if (WagaAktualna == 5) {
            myView.findViewById(R.id.pierwszy_white_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-5;
            if (WagaAktualna == 2.5) {
                WagaAktualna=WagaAktualna-2.5;
                if (WagaAktualna == 1.25) {
                    WagaAktualna=WagaAktualna-1.25;
                    if (WagaAktualna == 0.5) {
                        WagaAktualna=WagaAktualna-0.5;
                    }
                }
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }
            else if (WagaAktualna == 1.25) {
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }
            else if (WagaAktualna == 0.5) {
                WagaAktualna=WagaAktualna-0.5;
            }
        }
        else  if (WagaAktualna == 2.5) {
            myView.findViewById(R.id.pierwszy_black_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-2.5;
            if (WagaAktualna == 1.25) {
                WagaAktualna=WagaAktualna-1.25;
                if (WagaAktualna == 0.5) {
                    WagaAktualna=WagaAktualna-0.5;
                }
            }
            else if (WagaAktualna == 0.5) {
                WagaAktualna=WagaAktualna-0.5;
            }

        }
        else  if (WagaAktualna == 1.25) {
            TvBPMaxHalf.setText(String.valueOf(WagaAktualna));
            myView.findViewById(R.id.pierwszy_dgrey_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-1.25;

            if (WagaAktualna == 0.5) {
                WagaAktualna=WagaAktualna-0.5;
            }
        }
        else  if (WagaAktualna == 0.5) {
            myView.findViewById(R.id.pierwszy_grey_ele).setVisibility(View.VISIBLE);
            WagaAktualna=WagaAktualna-0.5;
        }

    }

    public void Barfillremover(){
        myView.findViewById(R.id.pierwszy_red_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_blue_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_dgrey_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_black_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_green_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_grey_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_yellow_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.pierwszy_white_ele).setVisibility(View.INVISIBLE);


        myView.findViewById(R.id.drugi_red_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_blue_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_dgrey_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_black_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_green_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_yellow_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.drugi_white_ele).setVisibility(View.INVISIBLE);


        myView.findViewById(R.id.trzeci_red_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_blue_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_dgrey_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_black_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_green_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_yellow_ele).setVisibility(View.INVISIBLE);
        myView.findViewById(R.id.trzeci_white_ele).setVisibility(View.INVISIBLE);


    }

    public void TableFill(double WagaWpisana){
       proc100.setText(String.valueOf(WagaWpisana));
        proc90.setText(String.valueOf(WagaWpisana*90/100));
        proc75.setText(String.valueOf(WagaWpisana*75/100));
        proc50.setText(String.valueOf(WagaWpisana*50/100));
    }
}
//Kolory   25 czerwony
//         20 niebieski
//         15 zolty
//         10 zielony
//         5 bialy
//         2.5 czarny
//         1.25 dgrey
//         0.5 grey