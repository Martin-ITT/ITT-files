
package yr1s1ca2roadtaxfinal;
import java.util.Scanner;

/**
 *
 * @author Martin Pavlin /x00135214
 * @author INESS lUNGA / X00125943

 */
public class Yr1s1CA2RoadTaxFinal
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    //input scanner
        Scanner ourSC = new Scanner(System.in);
        
    // initial screen
        System.out.println("\t*****************************");
        System.out.println("\t*****************************");
        System.out.println("\t*****MOTOR TAX EVIDENCE******");
        System.out.println("\t*****************************");
        System.out.println("\t*****************************");
        String passSystem; //first input string
        String passCheck; //second input string
        String userName; //user name string
        int counterName = 0; //name input counter
        //int counterPass = 0; //password counter
        
        //three attempts for correct user name format
        while(counterName < 3)
            {
            System.out.print("\tPlease enter user name: ");
            userName = ourSC.nextLine();
            int counterPass = 0; //password counter
            
            //name correct format check
            if(userName.length() > 6)
                {
                System.out.print("\tPlease enter password: ");
                passSystem = ourSC.nextLine();
                
                //three attempts for password
                while(counterPass < 3)
                    {
                    //If input here main password is always changed
                    //System.out.print("\tPlease enter password: ");
                    //passSystem = ourSC.nextLine();
                    System.out.print("\tPlease re-enter password: ");
                    passCheck = ourSC.nextLine();
                    if(passSystem.equals(passCheck))
                        {
    
                //PART 2                    //System.out.println("main program here*****************************");
                        String carMake;
                        String carModel;
                        int roadTax = 0; //variable moved here to work in other menu options
                        int emissionCo2; //variable moved here to work in other menu options
                        String registrationNumber;
                        //int carYear;
                        int sumRoadTax = 0;
                        int sumCo2 = 0;
                        int avgCo2 = 0;
                        int carYearInt;
                        int avgYear = 0;
                        int carYearSum = 0;

                        int menuOption; //menu selection
                        int exitMenu1;
                        int counterMenu1 = 0;

                        //variables car per category
                        int counT0 = 0; 
                        int counT80 = 0;
                        int counT100 = 0;
                        int counT110 = 0;
                        int counT120 = 0;
                        int counT130 = 0;
                        int counT140 = 0;
                        int counT155 = 0;
                        int counT170 = 0;
                        int counT190 = 0;
                        int counT225 = 0;
                        int counTlast = 0;

                        do 
                            {
                                System.out.println("");  //menu output  
                            System.out.println("\t*****************************");
                            System.out.println("\t********** TAX.IE ***********");
                            System.out.println("\t*****************************");
                            System.out.println("\t*1) Enter new car to system *");
                            System.out.println("\t*2) Statistics for TAX.IE   *");
                            System.out.println("\t*3) Accounts for TAX.IE     *");
                            System.out.println("\t*4) Tax category info       *");
                            System.out.println("\t*5) Exit                    *");
                            System.out.println("\t*****************************");
                            System.out.println("\t*****************************");
                            System.out.print("\tPlease select an option: ");
                            menuOption = ourSC.nextInt();

                                if(menuOption == 1) //new car
                                    {
                                    do
                                        {
                                            System.out.println("");
                                        System.out.print("Please enter car make: ");
                                        carMake = ourSC.nextLine();
                                        System.out.print("Please enter car model: ");
                                        carModel = ourSC.nextLine();
                                        do
                                            {
                                            System.out.print("Please enter car registration number: ");
                                            registrationNumber = ourSC.nextLine();

                                                if (!registrationNumber.contains("-"))
                                                    {
                                                     System.out.println("Incorrect registration number format!");
                                                    }
                                            } while(!registrationNumber.contains("-"));

                        //PART 3 HERE
                                        System.out.print("Please enter CO2 emissions: ");
                                        emissionCo2 = ourSC.nextInt();

                                        final int co0 = 0; //120
                                        final int co80 = 80; //170
                                        final int co100 = 100; //180
                                        final int co110 = 110; //190
                                        final int co120 = 120; //200
                                        final int co130 = 130; //270
                                        final int co140 = 140; //280
                                        final int co155 = 155; //390
                                        final int co170 = 170; //570
                                        final int co190 = 190; //750
                                        final int co225 = 225; // 1200 / 2350

                                        if(emissionCo2 == co0)
                                            {
                                            roadTax = 120;
                                            counT0++;
                                            }
                                        else if(emissionCo2 <= co80)
                                            {
                                            roadTax = 170;
                                            counT80++;
                                            }
                                        else if(emissionCo2 <= co100)
                                            {
                                            roadTax = 180;
                                            counT100++;
                                            }
                                        else if(emissionCo2 <= co110)
                                            {
                                            roadTax = 190;
                                            counT110++;
                                            }
                                        else if(emissionCo2 <= co120)
                                            {
                                            roadTax = 200;
                                            counT120++;
                                            }
                                        else if(emissionCo2 <= co130)
                                            {
                                            roadTax = 270;
                                            counT130++;
                                            }
                                        else if(emissionCo2 <= co140)
                                            {
                                            roadTax = 280;
                                            counT140++;
                                            }
                                        else if(emissionCo2 <= co155)
                                            {
                                            roadTax = 390;
                                            counT155++;
                                            }
                                        else if(emissionCo2 <= co170)
                                            {
                                            roadTax = 570;
                                            counT170++;
                                            }
                                        else if(emissionCo2 <= co190)
                                            {
                                            roadTax = 750;
                                            counT190++;
                                            }
                                        else if(emissionCo2 <= co225)
                                            {
                                            roadTax = 1200;
                                            counT225++;
                                            }
                                        else
                                            {
                                            roadTax = 2350;
                                            counTlast++;
                                            }

                                        System.out.println("");
                                        System.out.println("\tYou have entered following car: ");
                                        System.out.println("\tMake: " +carMake);
                                        System.out.println("\tModel: " +carModel);
                                        System.out.println("\tCO2: " +emissionCo2);
                                        System.out.println("\tRegistration number: " +registrationNumber);
                                        //System.out.println(registrationNumber.charAt(0));
                                        if(registrationNumber.charAt(0) == '0'
                                                || registrationNumber.charAt(0) == '1')
                                            {
                                            //System.out.println("\tYear: 20" +registrationNumber.substring(0,2));    
                                            carYearInt = Integer.parseInt(registrationNumber.substring(0,2)) + 2000;

                                            }
                                        else
                                            {
                                            //System.out.println("\tYear: 19" +registrationNumber.substring(0,2));
                                            carYearInt = Integer.parseInt(registrationNumber.substring(0,2)) + 1900;
                                            }

                                        System.out.println("\tYear registered: " +carYearInt);

                                        System.out.println("\t------------------");
                                        System.out.println("\tAnnual road tax: " + roadTax);
                                        System.out.println("");

                                        counterMenu1++;

                                        carYearSum = carYearSum + carYearInt;
                                        avgYear = carYearSum / counterMenu1;

                                        sumRoadTax = sumRoadTax + roadTax;

                                        sumCo2 = sumCo2 + emissionCo2;
                                        avgCo2 = sumCo2 / counterMenu1;

                                        System.out.println("\tEnter 0 to return to main menu.");
                                        System.out.print("\tEnter 1 to add another car: ");
                                        exitMenu1 = ourSC.nextInt();
                                        }while(exitMenu1 !=0);

                                    }
                                else if(menuOption == 2) //statistics
                                    {
                                        System.out.println("");
                                        System.out.println("\tAverage year of registration is: " +avgYear );
                                        System.out.println("\tAverage CO2 of entered cars is: " +avgCo2);
                                    }
                                else if(menuOption == 3) // accounts
                                    {
                                        System.out.println("");
                                        System.out.println("\tTotal tax collected: " +sumRoadTax);
                                        System.out.println("\tTotal cars entered: " +counterMenu1);
                                        System.out.println("\tAverage tax per car: " +(sumRoadTax/counterMenu1));

                                    }
                                else if(menuOption == 4) //category info
                                    {
                                        System.out.println("");
                                        System.out.println("\t Category \t\t Cars entered");
                                        System.out.println("\t   0g \t\t" +counT0);
                                        System.out.println("\t   1 - 80g \t\t" +counT80);
                                        System.out.println("\t  81 - 100g \t\t" +counT100);
                                        System.out.println("\t 101 - 110g \t\t" +counT110);
                                        System.out.println("\t 111 - 120g \t\t" +counT120);
                                        System.out.println("\t 121 - 130g \t\t" +counT130);
                                        System.out.println("\t 131 - 140g \t\t" +counT140);
                                        System.out.println("\t 141 - 155g \t\t" +counT155);
                                        System.out.println("\t 156 - 170g \t\t" +counT170);
                                        System.out.println("\t 171 - 190g \t\t" +counT190);
                                        System.out.println("\t 191 - 225g \t\t" +counT225);
                                        System.out.println("\t 225 -  \t\t" +counTlast);
                                    }
                                else if(menuOption == 5) //exit
                                    {

                                    }
            

                                    }while(menuOption != 5);
                         
                            counterPass = 3; //reset any incorrect inputs or value 3 to start program again
                            counterName = 3; //reset any incorrect inputs or value 3 to terminate program
// PART ONE CONTINUE                        
                        }
                    else
                        {
                        if (counterPass < 1) //first and second password attempt
                            {
                            System.out.println("\tPassword incorrect!");
                            System.out.println("\tYou have " + (2 - counterPass) +" more attempts.");
                            counterPass++;
                            }
                        else if(counterPass == 2) //no more password attempt
                            {
                            System.out.println("\tAcces denied!");
                            counterPass = 5;
                            counterName = 5; //exit program
                            }
                        else  //last password attempt
                            {
                            System.out.println("\tPassword incorrect!");
                            System.out.println("\tLast attempt");
                            counterPass++;
                            }
                        }
                    }
                }
            
            else
                {
                if (counterName < 1)
                    {
                    System.out.println("\tIncorrect format! Name not long enough!");
                    System.out.println("\tYou have " + (2 - counterName) +" more attempts.");
                    counterName++;
                    }
                else if(counterName == 2)
                    {
                    System.out.println("\tAcces denied!");
                    counterName = 5; //exit program
                    }
                else    
                    {
                    System.out.println("\tIncorrect format! Not long enough!");
                    System.out.println("\tLast attempt");
                    counterName++;
                    }
            }
        }
        
    }
    
}

    
}
