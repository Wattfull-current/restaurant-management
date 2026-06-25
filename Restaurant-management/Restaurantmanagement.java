/**
 * Program for  restaurant management.
 * There are some coustomised output design hidden in comments, if you want to use you can.
 * @author Naman
 * @version 1.0
 */
import java.util.*;
import java.time.*;
import java.time.format.*;
public class Restaurantmanagement //class start                                                                                                             
 {     
    static Scanner sc = new Scanner(System.in);
    static String coustname="";//to store coustmer name
    static String id="";// to store shool identification number
    static int j =0;//to store number of input attempts
    int store=0;//to store the no of time order is made
    void time ()
    {
         LocalTime currentTime = LocalTime.now();
         LocalDate currentDate = LocalDate.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
         String formattedTime = currentTime.format(formatter);
         LocalDate today = LocalDate.now();
         String dayOfWeek = today.getDayOfWeek().
         getDisplayName(TextStyle.FULL, Locale.ENGLISH);
         System.out.println("\tDate :\t"+ currentDate +", " +dayOfWeek);
        System.out.println("\tTime :\t "+formattedTime);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        Canteen ob = new Canteen ();
        /* Output design if you want
        for(int i =0;i<=1;i++)
        {
            for(int j=0;j<=300;j++)
            System.out.print("\u2023");
            System.out.println();
        }
        */
        System.out.println("\t\t\t\t\t\tWelcome to Canis Majoris Restaurant");
        System.out.println("\tThank you for reaching us. We will ensure to provide you the best of us. ");
        ob.time();
        /* Output design
        for(int i =0;i<=300;i++)
        System.out.print("\u2022");
        System.out.println();
        */
        System.out.print(" Name -");
        coustname = in.nextLine();
        System.out.println("Phone number-(if NO - N)");
        System.out.print("Your input :");
        id = in.nextLine();
        System.out.println();
        System.out.println("Namaskar, "+ coustname);
        System.out.println( "Thank you. Please proceed with the menu. We have various Range of food.");
        ob.input();
    }
    String  choi="";
    void input()
    {
        for(int i =0;i<=100;i++)
        System.out.print("-");
        System.out.println();
        System.out.println("\t\t\t\t\t\tMAIN MENU  ");
        System.out.println( "\t\t1. \tBREAKFAST"+"\n"+"\t\t2.\tLUNCH"+"\n"+"\t\t3.\tSNACKS\n"+"\t\t4.\tBeverages\n"+ "\t\t5.\tExit\n");
        System.out.println("What will you like to have? Please Enter the Valid Choice");
        System.out.print("Your Input:");
         choi = sc.next();//to input choice 
        if(choi.equals("1"))
        Breakfast(choi);
        else if(choi.equals("2"))
        Lunch(choi);
        else if (choi.equals("3"))
        Snack(choi);
        else if(choi.equals("4"))
        Beverages(choi);
        else if( choi.equals("5"))
        {
            System.out.println();
            if(order.equals(""))
            {
                System.out.println("Thank You");
                System.exit(0);
            }
            else 
            Bill();
        }
        else
        {
            j++;
            if(j==3)
            {
                System.out.println("Wrong input");
                System.exit(0);
            }
            for(int i =0;i<=100;i++)                                                                                                              
            System.out.print("\u2022");
            System.out.println();
            System.out.println("You have entered a wrong input,Please try again with correct");
            input();
        }
    }
       String[] Snacks = {"Cheese Pizza", "Onion Pizza", "CheeseBurger", "Samosa Chaat","Paratha Roll","French Fries","Chowmein", "Chilli Potato", "Fried Rice","Double Burger", "Bhelpuri", "Chocolate Fudge Brownies","King Size Burger", "Farm Fresh Pizza","White Sauce Pasta", "Momos", "Pakode"};
       int[] SnacksRS = {250, 200, 50, 40, 40, 45, 30, 30,30, 30, 30, 30, 80, 250, 100, 30, 25};
       String[] Lunch = {"Fulka", "Roti", "Tandoori","Rumali Roti","Chole", "Dal", "Pulao", "Khichdi", "Dry Lady Finger", "Aloo Gobhi", "Sahi Paneer", "Rajma Chawal",  "Plain Rice", "Panner Butter Masala","Plain Butter milk", "Masala Butter Milk"};
       int[] LunchRS = {20, 16, 30, 20, 25, 15, 20, 15, 15, 30, 15, 15, 20, 20, 50, 10 };
       int[] BeveragesRS = {10, 12, 20, 25, 20, 20, 20, 25, 40, 25, 15, 15};
       String[] Beverages = {"Black Tea", "Lemon Tea",  "Black Coffee", "Iced Coffee", "Plain Milk","Cold Drink", "Lemonade", "Coconut Water", "Chocolate MilkShake", "Hot chocolate coffee","Tea", "Coffee"};
       int[] BreakFastRS = {20, 15, 25, 20, 25, 30, 20, 25, 30, 30, 20, 20, 20};
       String[] BreakFast = {"Panner Paratha", "Aloo Paratha", "Paneer Roll", "Veg Roll","Plain Dosa","Paneer Dosa","Cheese Sandwich", "Paneer Sandwich", "Garlic Bread","Chole Bhature","Idli Sambhar", "Tomato Cheese Sandwich","Maggie"};
    void Breakfast(String b)
    {
        System.out.println("\t\t\t\t\t\tBREAKFAST");
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        System.out.printf("%10s%-10s%-3s%-30s%-3s%-2s%s%s\n","","S.No.","|","ITEMS","|","COST(Large)","/","Medium)");
        System.out.println();
        for(int i =0;i<13;i++)
        {
             System.out.printf("%10s%-10d%-3s%-30s%-9s%s%-4d%-2s%s%d\n", "",(i+101),"|",BreakFast[i],"|","\u20B9",BreakFastRS[i],"/","\u20B9",(BreakFastRS[i]/2));
        }
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        inputinmenu();
    }
     void Lunch(String l)
    {
        System.out.println("\t\t\t\t\t\tLUNCH");
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        System.out.printf("%10s%-10s%-3s%-30s%-3s%-2s%s%s\n","","S.No.","|","ITEMS","|","COST(Large)","/","Medium)");
        System.out.println();
        for(int i =0;i<Lunch.length;i++)
        {
             if(i<4)
             System.out.printf("%10s%-10d%-3s%-30s%-9s%s%-4d%s\n","",(i+201),"|",Lunch[i],"|","\u20B9",LunchRS[i],"(Per piece)");
             else
             System.out.printf("%10s%-10d%-3s%-30s%-9s%s%-4d%-2s%s%d\n","",(i+201),"|",Lunch[i],"|","\u20B9",LunchRS[i],"/","\u20B9",(LunchRS[i]/2));
        }
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        inputinmenu();
    }
     void Snack(String s)
    {
        System.out.println("\t\t\t\t\t\tSnacks");
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        System.out.printf("%10s%-10s%-3s%-30s%-3s%-2s%s%s\n","","S.No.","|","ITEMS","|","COST(Large)","/","Medium)");
        System.out.println();
        for(int i =0;i<17;i++)
        {
             System.out.printf("%10s%-10d%-3s%-30s%-9s%s%-4d%-2s%s%d\n","",(i+301),"|",Snacks[i],"|","\u20B9",SnacksRS[i],"/","\u20B9",(SnacksRS[i]/2));
        }
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        inputinmenu();
    }
    void Beverages(String s)
    {
        System.out.println("\t\t\t\t\t\tBeverages");
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
                System.out.printf("%10s%-10s%-3s%-30s%-3s%-2s%s%s\n","","S.No.","|","ITEMS" ,"|","COST(Large)","/","Medium)");
        System.out.println();
        for(int i =0;i<12;i++)
        {
             System.out.printf("%10s%-10d%-3s%-30s%-9s%s%-4d%-2s%s%d\n","",(i+401),"|",Beverages[i],"|","\u20B9",BeveragesRS[i],"/","\u20B9",(BeveragesRS[i]/2));
        }
        for(int i =0;i<200;i++)
        System.out.print("\u2043");
        System.out.println();
        inputinmenu();
    }
    int k =0,l=0,no=0,v=0;
    String order = "";//to store the code of each item
    String noofitem = "";//to store quntity of each item
    String Size = "";   //to store size of each item
    void inputinmenu()
    {
        System.out.print("Enter the Code of the item you want : ");
        String inputinmenu = sc.next();
        int t = Integer.valueOf(inputinmenu);
        System.out.print("\n");
        if(choi.equals(String.valueOf(t/100)))
        {
            if((t>=401&&t<=412)||(t>=301&&t<=317)||
            (t>=201&&t<=216)||(t>=101&&t<=113))
            {   
                if(!(t>200&&t<205))
                {
                   size(); 
                    store++;
                }
                else
                {
                    store++;
                }
                order =  inputinmenu+" "+ order;
                System.out.print("Enter the no. you want - ");
                 no = sc.nextInt();
                System.out.println();
                noofitem = no +" "+ noofitem;
                char ce=' ';
                if(!(t>200&&t<205))
                while(ce!='N'||ce!='n')
                {
                     System.out.print("Do you Want to order  same in another size: (Yes-Y)/(No-N)");
                     ce = sc.next().charAt(0);
                    if(ce=='Y'||ce=='N'||ce=='y'||ce=='n')
                    {
                             if(ce=='Y'||ce=='y')
                            {
                                order =  inputinmenu+" "+ order;
                                size();
                                System.out.print("Enter the no. you want -");
                                store++;
                                no = sc.nextInt();
                                System.out.println();
                                noofitem = no +" "+ noofitem;
                                System.out.println();
                            }
                            else 
                               break;
                     }
                    else
                       {
                        System.out.println("We are Sorry, Please try again ");
                        System.out.println("1. Print Bill \n"+ "2. Try again");
                        int ass = sc.nextInt();
                        if(ass==1)
                        Bill();
                        else if(ass==2)
                        {
    if(v==2)
    {
        if(order.equals(""))
        System.out.println("We are Sorry,We could not find what you are looking for,Thank for visiting us ");
         else 
        Bill();
    }
     else
    inputinmenu();
     v++;
    }
}
}
    System.out.print("Do you Want to order something else: (Yes-Y)/(No-N)");
    char ch = sc.next().charAt(0);
    System.out.println();
    if(ch=='Y'||ch=='N'||ch=='y'||ch=='n')
    {
        if(ch=='Y'||ch=='y')
         {
            System.out.println(" 1 - To Return Main menu ");
            System.out.println(" 2 - Proceed with your order in the same submenu ");
            int nn = sc.nextInt();
            if(nn==1)
            input();
            else if(nn==2)
             inputinmenu();
            else
            {
            if(order.equals(" "))
            System.out.println("We are Sorry, We could not find what you are looking for,Thank for visiting us ");
            else 
             Bill();
        }
    }
        else if(ch=='N'||ch=='n')
        {
           System.out.println(" Printing Bill");
           Bill();
         }
    }
    else
    {
        System.out.println("We are Sorry,Please try again ");
        System.out.println("1. Print Bill \n"+ "2. Try again");
        int as = sc.nextInt();
        if(as==1)
        Bill();
        else if(as==2)
        {
          if(l==2)
          {
            if(order.equals(" "))
            System.out.println("We are Sorry, We could not find what you are looking for,Thank for visiting us ");
            else 
            Bill();
          }
          else
          inputinmenu();
           l++;
         }
    }
}
    else 
    {
        if(k==2)
        {
             System.out.println("We are Sorry, Please try again ");
            System.exit(0);
        }
        else
        {
            System.out.println("Wrong code, There is no such product, Please try again with correct code");
            k++;
        }
        inputinmenu();
    }
}
    else 
    {
        if(k==2)
        {
         System.out.println("We are Sorry, Please try again ");
         System.exit(0);
        }
        else
        {
          System.out.println("Wrong code, There is no such product, Please try again with correct code");
          k++;
        }
        inputinmenu();
 }
} 
    int x=0;
    void size()
    {
        System.out.println("In Which size  do you want?\n\t1.\tLarge\n\t2.\tMedium");
        System.out.print("Your Input :");
        char j = sc.next().charAt(0);
        System.out.println();
        if(j=='1'||j=='2')
        {
            Size = j+" "+Size;
        }
        else 
        {
            if(x==2)
            {
                if(order.equals(""))
                {
                    System.out.println("We are Sorry, We could not find what you are looking for,Thank for visiting us ");
                    System.exit(0);
                }
                
                else 
                Bill();
             }
             else
             {
                 x++;
                 System.out.print("Sorry we could not get what you typed, Try again");
                 System.out.println("\n");
                 size(); 
             }
        }
    }
    void Bill()
    {
        for(long i =0;i<10000;i++)
        for(long j =0;j<1000;j++)
        {}
        System.out.println();
        System.out.println();
        for(int i =0;i<=301;i++)
        System.out.print("\u25E6");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tBILL INVOICE");
        for(int i =0;i<=301;i++)
        System.out.print("\u25E6");
        System.out.println();
        System.out.println("\t\t\t\t\t\tCANIS MAJORIS INTERANTIONAL SCHOOL CANTEEN ");
        System.out.println("\t\t\t\t\t\tLittle Whinging, Budleigh Babberton, Surrey");
        System.out.println("\t\t\t\t\t\t\tEmail - office@canis.in");
        System.out.println("\t\t\t\t\t\t\tPhone - 1234567890 ");
        for(int i =0;i<=301;i++)
        System.out.print("\u2219");
        System.out.println("\n");
        System.out.println("\tName :\t"+coustname);
        if(!(id.equalsIgnoreCase("N")))
        System.out.println("\tSchool Identification No. :\t"+id);
        time();
        for(int i =0;i<=301;i++)
        System.out.print("-");
        System.out.println();
        System.out.printf("%-10s%-30s%-30s%-20s%-30s%-20s\n","CODE","ITEM","QUANTITY","SIZE","COST PER PIECE","TOTAL");
        String itemc[]= new String[store];// to store code 
        String wrdc="", noi="";
        int noitem[]= new int[store];
        int sze[]= new int[store];//to store sizes of each order
        int n =0;
        for(int i =0;i<order.length();i++)
        {
            char chh = order.charAt(i);
            if(chh==' ')
            {
                itemc[n]=wrdc;
                n++;
                wrdc="";
            }
            else
                wrdc=wrdc+chh;
        }
        int b =0;
        for(int i =0;i<noofitem.length();i++)
        {
            char chhh = noofitem.charAt(i);
            if(chhh==' ')
            {
                noitem[b]=Integer.valueOf(noi);
                b++;
                noi="";
            }
            else
                noi = noi+chhh;
        }
        int c=0;
        for(int i =0;i<Size.length();i++)
        {
            char chhh = Size.charAt(i);
            if(chhh==' ')
            {
                sze[c]=Integer.valueOf(noi);
                c++;
                noi=""; 
            }
            else
                noi = noi+chhh;
        }
        for(int i =0;i<store;i++)
        {
            for(int j =0;j<store;j++)
            {
                if(i!=j)
                {
                  if(itemc[i].equals(itemc[j]))
                  {   
                      if(sze[i]==sze[j])
                      {
                          itemc[j]="";
                          noitem[i]=noitem[i]+noitem[j];
                          noitem[j]=0;
                          sze[j]=0;
                      }
                  }
                }
            }
        }
        int total =0;//to store total amount
for (int i =0;i<store;i++)
{   
   if(noitem[i]==0&&sze[i]==0)
   continue;
   else
   {
     int d = (Integer.valueOf(itemc[i])-1)/100;
     int r = (Integer.valueOf(itemc[i])-1)%100;
     if(d==1)
     {
       int t=0;
       String s="";
       if(sze[i]==1)
       {
        s="Large";
        t = BreakFastRS[r];
        }
       else
       {
         s="Medium";
         t = (BreakFastRS[r]/2);
       }
       System.out.printf("%-10s%-30s%-30d%-20s%s%-30d%s%-20d\n", itemc[i],
       BreakFast[r],noitem[i],s,"\u20B9",t,"\u20B9",(t*noitem[i]));
       System.out.println();
       total = total+(t)*noitem[i];
     }
     if(d==2)
     {
       int t=0;
       String s="";
       if(r<4)
       {
        t = LunchRS[r];
        System.out.printf("%-10s%-30s%-30d%-20s%s%-30d%s%-20d\n",
        itemc[i],Lunch[r],noitem[i],"-","\u20B9",t,"\u20B9",(t*noitem[i]));
        total = total+(t*noitem[i]);
       }
       else 
       {
         if(sze[i]==1)
         {
           s="Large";
           t = LunchRS[r];
         }
         else
         {
           s="Medium";
           t = (LunchRS[r]/2);
          }
         System.out.printf("%-10s%-30s%-30d%-20s%s%-30d%s%-20d\n",
         itemc[i],Lunch[r],noitem[i],s,"\u20B9",t,"\u20B9",(t*noitem[i]));
         System.out.println();
         total = total+(t*noitem[i]);
                    }
     }
     if(d==3)
     {
       int t=0;
       String s="";
       if(sze[i]==1)
       {
        s="Large";
        t = SnacksRS[r];
       }
       else
       {
        s="Medium";
         t = (SnacksRS[r]/2);
       }
       System.out.printf("%-10s%-30s%-30d%-20s%s%-30d%s%-20d\n",
       itemc[i],Snacks[r],noitem[i],s,"\u20B9",t,"\u20B9",(t*noitem[i]));
       System.out.println();
        total = total+(t*noitem[i]);
     }
     if(d==4)
     {
       int t=0;
       String s="";
       if(sze[i]==1)
       {
         s="Large";
         t = BeveragesRS[r];
       }
       else
       {
         s="Medium";
         t = (BeveragesRS[r]/2);
       }
       System.out.printf("%-10s%-30s%-30d%-20s%s%-30d%s%-20d\n",
       itemc[i],Beverages[r],noitem[i],s,"\u20B9",t,"\u20B9",(t*noitem[i]));
       System.out.println();
        total = total+(t*noitem[i]);
                }
            }
         }
    for(int i =0;i<301;i++)
    System.out.print("\u25E6");
    System.out.println();
    System.out.println("Your total: "+"\u20B9"+total);
    System.out.println();
    System.out.println("\t\t\t------------Thank you for visiting us--------------");
    System.exit(0);
  }
}