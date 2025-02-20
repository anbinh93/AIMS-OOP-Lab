
package hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(int id, String title) {
        super(id, title);
    }
    // Constructors - Section 10

//    public DigitalVideoDisc(String title) {
//        super(title);
//    }
    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        super(id, title, category, director, cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, director, length, cost);
    }

    // id - DVD - title - category - director - length - cost
    public String toString() {
        String result = this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + "$";
        return result;
    }

     public boolean isMatch(String title){
     	if (this.getTitle().toLowerCase().equals(title.toLowerCase())) {
     		return true;
     	}
     	return false;
     }
     public boolean isMatch(int id){
     	if (this.getId() == id) {
     		return true;
     	}
     	return false;
     }

    public void play() {
        if (this.getLength() <= 0) {
            System.out.println("DVD " + this.getTitle() + " can't be played!");
        } else {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }
}