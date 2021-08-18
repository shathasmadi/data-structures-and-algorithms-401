package stack.and.queue;

public class AnimalShelter {
    private  Queue<Dog> dog = new Queue<>();
    private  Queue<Cat> cat = new Queue<>();


    public Dog enqueue(Dog value) {
      this.dog.enqueue(value);
        return value;
    }

    public Cat enqueue(Cat value) {
        this.cat.enqueue(value);
        return value;
    }

    public String dequeue(String pref){
        if (pref.equals("dog") && !dog.isEmpty()){
            this.dog.dequeue();
            return pref;
        }
        else if (pref.equals("cat") && !cat.isEmpty()){
            this.cat.dequeue();
            return pref;
        }
        else {
            return null;
        }
    }

}
