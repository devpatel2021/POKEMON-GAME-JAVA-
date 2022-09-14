import java.util.Scanner;
public class pokemon{
    public static void main(String[] args) {
       
        System.out.println("WElcome to the Pokemon Game");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name of the player");  //Prints the line
        String name = in.nextLine();    //Read users input  
        System.out.println(" Player is Named as Master " + name);     //Creates user Output
       // Now the user will go to the forest to catch pokemons and 
       //after that he will get the badge according to the selection

        System.out.println("Let's start the game");
        System.out.println("Let's move towards the forest to catch pokemons.....");

        
    //variables
        int choice ;
        int count = 0;
        int  temp = 0;
        int Pikachu =1;
       int EEeve =2;
       int Bulbasaur=3;
       int Ivysaur=4;
       int Venusaur=5;
       int Charmander=6;
       int Charizard=7;
       int Squirtle=8;
       int Wartortle=9;
       int UChoice ;
       
        while(count!=3)
        {
            System.out.println("Welcome to the forest... catch the pockemon by choosing from below list.");
            System.out.println("1.Pikachu");
            System.out.println("2.EEeve");
            System.out.println("3.Bulbasaur");
            System.out.println("4.Ivysaur");
            System.out.println("5.Venusaur");
            System.out.println("6.Charmander");
            System.out.println("7.Charizard");
            System.out.println("8.Squirtle");
            System.out.println("9.Wartortle");
            // Using Switch case
            choice = in.nextInt();
            switch(choice)
            {
                case 1:
                    temp += 3;
                    break;
                case 2:
                    temp += 3;
                    break;
                case 3:
                    temp += 3;
                    break;
                case 4:
                    temp += 2;
                    break;
                case 5:
                    temp += 2;
                    break;
                case 6:
                    temp += 2;
                    break;
                case 7:
                    temp += 1;
                    break;
                case 8:
                    temp += 1;
                    break;
                case 9:
                    temp +=1;
                    break;
            }
            count ++;
        }
        //Using nested if
        String badge = null;
        if (temp <= 5)
        {
            badge = "Silver";
        }    
        else if(temp >= 6 && temp <=7)
        {
            badge = "Gold";
        }
        else if(temp>=8)
        {
            badge = "Diamond";
        }
        //This will show that which badge does player have
        System.out.println("Your Badge = "+badge);
        System.out.println("Player have got the dedicated badge");
       System.out.println("Lets move towards the competetion");
   
       int computerselection;
  //do while and nested if use for each pokemon to create fight
    do{
        System.out.println("Welcome to the Pokemon game. If you want to play select one of your pokemon. press 10 to quit");
        UChoice = in.nextInt();
        computerselection=in.nextInt();
        if (UChoice == Pikachu)
         {
             if(computerselection== Pikachu){
                System.out.println("Pikachu versus pikachu : Tie Game");
            }
            else if(computerselection== EEeve){
                System.out.println("pikachu versus eeve: You won");  
             }
              else if(computerselection== Bulbasaur){
            System.out.println("pikachu versus bulbasaur: You Won");  
             }
             else if(computerselection== Ivysaur){
                System.out.println("pikachu versus Ivysaur: You Won");  
             }
              else if(computerselection == Venusaur){
            System.out.println("pikachu versus venusaur: You Won");  
             }
             else if(computerselection == Charmander){
                System.out.println("pikachu versus charmander: You won");  
             }
              else if(computerselection== Charizard){
            System.out.println("pikachu versus charizard: You Won");  
             }
             else if(computerselection== Squirtle){
                System.out.println("Pikachu versus squirtle: You won");  
             }
              else if(computerselection == Wartortle){
            System.out.println("Pikachu versus Wartortle: You Won");  
              }
        }

        if (UChoice == EEeve)
         {
             if(computerselection== Pikachu){
                System.out.println("EEve versus pikachu : You Lose");
            }
            else if(computerselection== EEeve){
                System.out.println("EEve versus eeve: Tie GAme");  
             }
              else if(computerselection== Bulbasaur){
            System.out.println("EEve versus bulbasaur: You Won");  
             }
             else if(computerselection== Ivysaur){
                System.out.println("EEve versus Ivysaur: You Won");  
             }
              else if(computerselection == Venusaur){
            System.out.println("EEve versus venusaur: You Won");  
             }
             else if(computerselection == Charmander){
                System.out.println("EEve versus charmander: You won");  
             }
              else if(computerselection== Charizard){
            System.out.println("EEve versus charizard: You Won");  
             }
             else if(computerselection== Squirtle){
                System.out.println("EEve versus squirtle: You won");  
             }
              else if(computerselection == Wartortle){
            System.out.println("EEve versus Wartortle: You Won");  
              }
        }
        if (UChoice == Bulbasaur)
         {
             if(computerselection== Pikachu){
                System.out.println("bulbasaur versus pikachu : You Lose");
            }
            else if(computerselection== EEeve){
                System.out.println("bulbasaur versus eeve: You lose");  
             }
              else if(computerselection== Bulbasaur){
            System.out.println("bulbasaur versus bulbasaur: Tie Game");  
             }
             else if(computerselection== Ivysaur){
                System.out.println("bulbasaur versus Ivysaur: You Won");  
             }
              else if(computerselection == Venusaur){
            System.out.println("bulbasaur versus venusaur: You Won");  
             }
             else if(computerselection == Charmander){
                System.out.println("bulbasaur versus charmander: You won");  
             }
              else if(computerselection== Charizard){
            System.out.println("bulbasaur versus charizard: You Won");  
             }
             else if(computerselection== Squirtle){
                System.out.println("bulbasaur versus squirtle: You won");  
             }
              else if(computerselection == Wartortle){
            System.out.println("bulbasaur versus Wartortle: You Won");  
              }}
              if (UChoice == Ivysaur)
              {
                  if(computerselection== Pikachu){
                     System.out.println("Ivusaur versus pikachu : You lose");
                 }
                 else if(computerselection== EEeve){
                     System.out.println("Ivysaur versus eeve: You lose");  
                  }
                   else if(computerselection== Bulbasaur){
                 System.out.println("Ivysaur versus bulbasaur: You LOse");  
                  }
                  else if(computerselection== Ivysaur){
                     System.out.println("Ivysaur versus Ivysaur: Tie");  
                  }
                   else if(computerselection == Venusaur){
                 System.out.println("Ivysaur versus venusaur: You Won");  
                  }
                  else if(computerselection == Charmander){
                     System.out.println("Ivysaur versus charmander: You won");  
                  }
                   else if(computerselection== Charizard){
                 System.out.println("Ivysaur versus charizard: You Won");  
                  }
                  else if(computerselection== Squirtle){
                     System.out.println("Ivysaur versus squirtle: You won");  
                  }
                   else if(computerselection == Wartortle){
                 System.out.println("Ivysaur versus Wartortle: You Won");  
                   }
             }
             if (UChoice == Venusaur)
         {
             if(computerselection== Pikachu){
                System.out.println("Venusaur versus pikachu : You Lose");
            }
            else if(computerselection== EEeve){
                System.out.println("Venusaur versus eeve: You lose");  
             }
              else if(computerselection== Bulbasaur){
            System.out.println("Venusaur versus bulbasaur: You Lose");  
             }
             else if(computerselection== Ivysaur){
                System.out.println("Venusaur versus Ivysaur: You lose");  
             }
              else if(computerselection == Venusaur){
            System.out.println("Venusaur versus venusaur: Tie");  
             }
             else if(computerselection == Charmander){
                System.out.println("Venusaur versus charmander: You won");  
             }
              else if(computerselection== Charizard){
            System.out.println("Venusaur versus charizard: You Won");  
             }
             else if(computerselection== Squirtle){
                System.out.println("Venusaur versus squirtle: You won");  
             }
              else if(computerselection == Wartortle){
            System.out.println("Venusaur versus Wartortle: You Won");  
              }
        }
            if(UChoice == Charmander)
        {
            if(computerselection== Pikachu){
               System.out.println("Charmander versus pikachu : You lose");
           }
           else if(computerselection== EEeve){
               System.out.println("Charmader versus eeve: You lose");  
            }
             else if(computerselection== Bulbasaur){
           System.out.println("Charmader versus bulbasaur: You Lose");  
            }
            else if(computerselection== Ivysaur){
               System.out.println("Charmader versus Ivysaur: You Lose");  
            }
             else if(computerselection == Venusaur){
           System.out.println("Charmander versus venusaur: You Lose");  
            }
            else if(computerselection == Charmander){
               System.out.println("Charmader versus charmander: Tie");  
            }
             else if(computerselection== Charizard){
           System.out.println("Charmader versus charizard: You Won");  
            }
            else if(computerselection== Squirtle){
               System.out.println("Charmader versus squirtle: You won");  
            }
             else if(computerselection == Wartortle){
           System.out.println("Charmader versus Wartortle: You Won");  
             }
       }
       if(UChoice == Charizard)
       {
        if(computerselection== Pikachu){
           System.out.println("Charizard versus pikachu : You lose");
       }
       else if(computerselection== EEeve){
           System.out.println("Charizard versus eeve: You lose");  
        }
         else if(computerselection== Bulbasaur){
       System.out.println("Charizard versus bulbasaur: You lose");  
        }
        else if(computerselection== Ivysaur){
           System.out.println("Charizard versus Ivysaur: You lose");  
        }
         else if(computerselection == Venusaur){
       System.out.println("Charizard versus venusaur: You lose");  
        }
        else if(computerselection == Charmander){
           System.out.println("Charizard versus charmander: You lose");  
        }
         else if(computerselection== Charizard){
       System.out.println("Charizard versus charizard: tie");  
        }
        else if(computerselection== Squirtle){
           System.out.println("Charizard versus squirtle: You won");  
        }
         else if(computerselection == Wartortle){
       System.out.println("Charizard versus Wartortle: You Won");  
         }
   }
   
  if(UChoice == Squirtle)
  {
   if(computerselection== Pikachu){
      System.out.println("squirtle versus pikachu : You Lose");
  }
  else if(computerselection== EEeve){
      System.out.println("squirtle versus eeve: You lose");  
   }
    else if(computerselection== Bulbasaur){
  System.out.println("squirtle versus bulbasaur: You LOse");  
   }
   else if(computerselection== Ivysaur){
      System.out.println("squirtle versus Ivysaur: You lose");  
   }
    else if(computerselection == Venusaur){
  System.out.println("squirtle versus venusaur: You lose");  
   }
   else if(computerselection == Charmander){
      System.out.println("squirtle versus charmander: You lose");  
   }
    else if(computerselection== Charizard){
  System.out.println("Squirtle versus charizard: You lose");  
   }
   else if(computerselection== Squirtle){
      System.out.println("Squirtle versus squirtle: Tie");  
   }
    else if(computerselection == Wartortle){
  System.out.println("Squirtle versus Wartortle: You Win");  
    }
}     
       if(UChoice == Wartortle)
       {
        if(computerselection== Pikachu){
           System.out.println("Wartortle versus pikachu : you lose");
       }
       else if(computerselection== EEeve){
           System.out.println("Wartortle versus eeve: You lose");  
        }
         else if(computerselection== Bulbasaur){
       System.out.println("Wartortle versus bulbasaur: You Lose");  
        }
        else if(computerselection== Ivysaur){
           System.out.println("Wartortle versus Ivysaur: You Lose");  
        }
         else if(computerselection == Venusaur){
       System.out.println("Wartortle versus venusaur: You Lose");  
        }
        else if(computerselection == Charmander){
           System.out.println("Wartortle versus charmander: You Lose");  
        }
         else if(computerselection== Charizard){
       System.out.println("Wartortle versus charizard: You Lose");  
        }
        else if(computerselection== Squirtle){
           System.out.println("wartortle versus squirtle: You Lose");  
        }
         else if(computerselection == Wartortle){
       System.out.println("wartortle versus Wartortle: Tie");  
         }
   
        }
       }while(UChoice != 10);    
       System.out.println("Thank You for Playing have a nice day");
       in.close();   
    }
  }

