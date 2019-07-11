package com.example.fitcometv3;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class BarFiller {
    View myView;
    double wagawlasciwa;

    public BarFiller(double waga, @NonNull LayoutInflater inflater, @Nullable ViewGroup container , int page) {
        if (page == 1) {
            myView = inflater.inflate(R.layout.maxbp_layout, container, false);
            TextView TvBPMax = myView.findViewById(R.id.maxbphalf);
            wagawlasciwa = waga / 2 - 20;
            if (wagawlasciwa == 0) {

                TvBPMax.setText("0kg");
            }
            if (wagawlasciwa == 25) {
                wagawlasciwa=wagawlasciwa-25;
                TvBPMax.setText((int) wagawlasciwa);
                myView.findViewById(R.id.pierwszy_red_ele).setVisibility(View.VISIBLE);
                //tu wstawic pozostale ify


                if (wagawlasciwa == 20) {
                    if (wagawlasciwa == 2.5) {
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }//if 0.5
                        }//if 1.25
                        if (wagawlasciwa == 0.5) {

                        }
                    }//if 2.5
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5
                }
                if (wagawlasciwa == 15) {
                    if (wagawlasciwa == 2.5) {
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }//if 0.5
                        }//if 1.25
                        if (wagawlasciwa == 0.5) {

                        }
                    }//if 2.5
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5

                }
                if (wagawlasciwa == 10) {
                    if (wagawlasciwa == 5) {
                        if (wagawlasciwa == 2.5) {
                            if (wagawlasciwa == 1.25) {
                                if (wagawlasciwa == 0.5) {

                                }//if 0.5
                            }//if 1.25
                            if (wagawlasciwa == 0.5) {

                            }
                        }//if 2.5
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }
                        }
                        if (wagawlasciwa == 0.5) {

                        }
                    }//if 5kg
                    if (wagawlasciwa == 2.5) {
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }//if 0.5
                        }//if 1.25
                        if (wagawlasciwa == 0.5) {

                        }
                    }//if 2.5
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5

                }//if 10kg
                if (wagawlasciwa == 2.5) {
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }
                    if (wagawlasciwa == 0.5) {

                    }

                }
                if (wagawlasciwa == 5) {
                    if (wagawlasciwa == 2.5) {
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }
                        }
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 2.5) {

                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 0.5) {

                    }

                }
                if (wagawlasciwa == 1.25) {


                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 0.5) {

                }

            }//end 25kg
            if (wagawlasciwa == 20) {
                if (wagawlasciwa == 2.5) {
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }
                }//if 2.5
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5
                }//if 1.25
                if (wagawlasciwa == 0.5) {

                }//if 0.5
            }
            if (wagawlasciwa == 15) {
                if (wagawlasciwa == 2.5) {
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }
                }//if 2.5
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5
                }//if 1.25
                if (wagawlasciwa == 0.5) {

                }//if 0.5

            }
            if (wagawlasciwa == 10) {
                if (wagawlasciwa == 5) {
                    if (wagawlasciwa == 2.5) {
                        if (wagawlasciwa == 1.25) {
                            if (wagawlasciwa == 0.5) {

                            }//if 0.5
                        }//if 1.25
                        if (wagawlasciwa == 0.5) {

                        }
                    }//if 2.5
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 0.5) {

                    }
                }//if 5kg
                if (wagawlasciwa == 2.5) {
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }//if 0.5
                    }//if 1.25
                    if (wagawlasciwa == 0.5) {

                    }
                }//if 2.5
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }//if 0.5
                }//if 1.25
                if (wagawlasciwa == 0.5) {

                }//if 0.5

                }//if 10kg
            if (wagawlasciwa == 2.5) {
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 0.5) {

                }
            }
            if (wagawlasciwa == 1.25) {
                if (wagawlasciwa == 0.5) {

                }
                if (wagawlasciwa == 0.5) {

                }

            }
            if (wagawlasciwa == 5) {
                if (wagawlasciwa == 2.5) {
                    if (wagawlasciwa == 1.25) {
                        if (wagawlasciwa == 0.5) {

                        }
                    }
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 0.5) {

                }
            }
            if (wagawlasciwa == 2.5) {

                if (wagawlasciwa == 1.25) {
                    if (wagawlasciwa == 0.5) {

                    }
                }
                if (wagawlasciwa == 0.5) {

                }

            }
            if (wagawlasciwa == 1.25) {


                if (wagawlasciwa == 0.5) {

                }
            }
            if (wagawlasciwa == 0.5) {

            }

        }
        if (page == 2) {
            myView = inflater.inflate(R.layout.maxsq_layout, container, false);
        }
        if (page == 3) {
            myView = inflater.inflate(R.layout.maxdl_layout, container, false);
        }
        if (page == 4) {
            myView = inflater.inflate(R.layout.maxohp_layout, container, false);
        }
    }
}
