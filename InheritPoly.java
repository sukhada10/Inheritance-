//Parent class
class Superhero {
    void power() {
        System.out.println("Every superhero has some power!");
    }
}

//Child class 1
class Ironman extends Superhero {
    @Override
    void power() {
System.out.println("Ironman:Genius-level intellect and a high-tech armored suit!");
    }
}
//child class 2
class spiderman extends Superhero {
    @Override
    void power() {
        System.out.println("spiderman:climbs walls and swings between skyscrapers with web!");
    }
}
//child class 3
class Doctorstrange extends Superhero {
    @Override
    void power() {
        System.out.println("Doctor strange:master of mystical arts and time manipulatiuon!");
    }
}

// Main class
public class InheritPoly {

     
        public static void main(String[]args) {
            Superhero hero;
            hero=new Superhero();
            hero.power(); 

            hero=new Ironman();
            hero.power();

            hero=new spiderman();
            hero.power();

            hero=new Doctorstrange();
            hero.power();
        }
    }
