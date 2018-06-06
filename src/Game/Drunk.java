package Game;

public class Drunk {

    /**
     * naam dronkaard
     */
    String name;


    int health;


    /**
     * drunkLevel gaat van 0 tot 100
     * attack strength wordt sterker tot 60 maar neemt daarna terug af
     * als je over 100 gaat
     */

    int drunkLevel;

    /**
     * Als de speler een biertje drinkt heeft hij de volgende beurt een flesje dat hij kan gooien.
     * drinkBeer method is dus enkel mogelijk
     */
    int weapon = -1;                    //all drunks start without a bottle
    int strength = 10*drunkLevel;


    public Drunk (String name){
        this.name = name;
        this.health = 100;
        this.drunkLevel = 20;
        this.weapon = -1;
    }

    /**
     * drink beer
     */

    public void drinkBeer() {
        if (this.weapon == -1) {

            this.drunkLevel += 10;
            this.weapon = weapon * -1;
            System.out.println(this.name + " orders a beer, drinks the bottle in one time. He holds the empty bottle in his hand.");
        } else {
            this.drunkLevel += 10;
            System.out.println(this.name + "orders a beer and drinks the bottle in one time. Can't carry any more bottles \n");
        }
    }

    public void randomCommand() {
    }

    /**
     * throw beer bottle
     */

    public void throwBottle(Drunk target){
        if (this.weapon == 1) {
            this.weapon = weapon * -1;
            target.health -= 20;
            System.out.println(this.name + " throws his bottle to " + target.name + " who takes 20 damage. ");
        } else {
            System.out.println(this.name + " looks confused as he has nothing to throw \n");
        }

    }

    /**
     * punch other drunk, does 10 damage, sober op 5 points
     */

    public void punch(Drunk target){
        target.health -= 10;
        this.drunkLevel -=5;
        System.out.println(this.name + " punches " + target.name + " who takes 10 damage.");


//        if (target.knockedOut()){
//            System.out.println(target.name + " is KO." + this.name + " won the barfight. He should be very proud.");
//        }
    }

    /**
     * checkStats checkt de alle stats van de player
     */

    public void checkStats() {
        System.out.println("Health is " +health);
        System.out.println(this.name + "is drunk" + drunkLevel);
        this.checkDrunk();



        if (this.weapon == 1) {
            System.out.println(this.name + "has a bottle");
        }

            else {
                System.out.println(this.name + "hands are empty");
            }
    }

    public void checkDrunk() {
        if (drunkLevel > 90){
            System.out.println(this.name + " looks ready to pass out.");
        } else if (drunkLevel > 70) {
            System.out.println(this.name + " looks very very drunk.");
        } else if (drunkLevel > 40) {
            System.out.println(this.name + " is getting pretty drunk.");
        } else if (drunkLevel > 20) {
            System.out.println(this.name + " is looking tipsy");
        } else {
            System.out.println(name + " is sobering up.");
        }
    }

    /**
     * boolean for KO
     */

    public boolean knockedOut() { return health <= 0;
    }

    /**
     * boolean for pass out
     */

    public boolean passedOut() { return drunkLevel > 100;
    }

    public boolean soberUp() { return drunkLevel <= 0;
    }




}
