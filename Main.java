import java.util.LinkedList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        LinkedList<String> names = new LinkedList<String>();

        System.out.println("Straw Hat Pirates");

        names.add("Monkey D. Luffy");
        names.add("Roronoa Zoro");
        names.add("Nami");
        names.add("Ussop");
        names.add("Vinsmoke Sanji");
        names.add("Tony Tony Chopper");
        names.add("Nico Robin");
        names.add("Franky");
        names.add("Brook");
        names.add("Jinbe");

        System.out.println(names);

    
        
        System.out.print("Select one member to know the information : ");
        String select = scan.nextLine();

        System.out.println();

        if(select.equalsIgnoreCase("Luffy") || select.equalsIgnoreCase("Monkey d. luffy") || select.equalsIgnoreCase("Mugiwara")){
            System.out.println("You chose, " + names.get(0));
            System.out.println("Captain of the Straw Hat Pirates, " + names.get(0) + "\nBounty : 3,000,000,000 berries");
            System.out.println("One of the four Emperors of the Sea");
            System.out.println("Has devil fruit, Hito Hito No mi Model : Nika");
        }else if (select.equalsIgnoreCase("Zoro") || select.equalsIgnoreCase("Roronoa zoro")){  
            System.out.println("You chose, Pirate Hunter " + names.get(1) +"\nBounty : 1,111,000,000 berries");
            System.out.println("The first mate of the future Pirate King\n" + "Vice Captain of the Straw Pirates");
            System.out.println("One of the worst generation in new world\nThree Swords Style Swordsman\nNo Devil Fruit");
        }else if(select.equalsIgnoreCase("Nami") || select.equalsIgnoreCase("Nami san")){
            System.out.println("You chose, Cat Burglar " + names.get(2));
            System.out.println("Navigator of the Straw Hats Pirates\nBounty : 366,000,000 berries");
            System.out.println("No devil fruit");
        }else if(select.equalsIgnoreCase("Ussop") || select.equalsIgnoreCase("Sogeking") || select.equalsIgnoreCase("God Ussop")){
            System.out.println("You chose, God " + names.get(3) + "Bounty : 500,000,000 berries");
            System.out.println("Sniper of the Straw Hats Pirates");
            System.out.println("No Devil Fruit");
        }else if(select.equalsIgnoreCase("Sanji") || select.equalsIgnoreCase("Vinsmoke Sanji")){
            System.out.println("You chose, Black Leg " + names.get(4));
            System.out.println("Chook of the Straw Hats Pirates\nBounty : 1,032,000,000 berries");
            System.out.println("Son of Vinsmoke Judge");
            System.out.println("No devil fruit");
        }else if(select.equalsIgnoreCase("Chopper") || select.equalsIgnoreCase("Tony Tony Chopper")){
            System.out.println("You chose, Cotton Candy lover " +names.get(5));
            System.out.println("The doctor of the Straw Hats Pirates\nBounty : 1,000 berries");
            System.out.println("Devil fruit : Hito Hito no mi ");
        }else if (select.equalsIgnoreCase("Nico Robin") || select.equalsIgnoreCase("Robin")){
            System.out.println("You chose, Devil Child " + names.get(6));
            System.out.println("Archaeologist of the Straw Hats Pirates\nBounty : 930,000,000 berries");
            System.out.println("Devil fruit : Hana Hana no Mi");
        }else if(select.equalsIgnoreCase("Franky")){
            System.out.println("You chose, Iron Man " + names.get(7));
            System.out.println("Shipwright of the Straw Hats Pirates\nBounty : 394,000,000 berries");
            System.out.println("No Devil Fruit");
        }else if(select.equalsIgnoreCase("Brook") || select.equalsIgnoreCase("Soul king brook")){
            System.out.println("You chose, Soul King " + names.get(8));
            System.out.println("The musician of the Straw Hats Pirates\nBounty : 383,000,000 berries ");
            System.out.println("Devil Fruit : Yomi Yomi no Mi ");
        }else if(select.equalsIgnoreCase("Jinbe") || select.equalsIgnoreCase("Jimbei")){
            System.out.println("You chose, Knight of the sea " + names.get(9));
            System.out.println("Helmsman of the Straw Hat Pirates\nBounty : 1,100,000,000 berries");
            System.out.println("Old member of Seven Warlords ");
        }

        
    }
}