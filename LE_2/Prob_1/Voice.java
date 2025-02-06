public class Voice {
    
   
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        
       s
        animals[0] = new Animal("Moo");  
        animals[1] = new Animal("Bark"); 
        animals[2] = new Animal("Oink");
        animals[3] = new Animal("Bleat"); 
        animals[4] = new Animal("Roar"); 

       
        hear(animals);
    }

   
    public void hear(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].makeSound());
        }
    }
}