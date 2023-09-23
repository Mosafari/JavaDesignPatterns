package Structural.Facade;

import java.util.Hashtable;

public class PetStore {
    private Hashtable<Integer, IAnimal> pets;
    private int Id=0;
    PetStore(){
        this.pets = new Hashtable<Integer, IAnimal>();
    }

    public int adoptPet(String type){
        IAnimal adoptedAnimal = null;
        if(type == "dog"){
            adoptedAnimal = new Dog();
            this.Id+=1;
        }else if (type == "cat"){
            adoptedAnimal = new Cat();
            this.Id+=1;
        }else if (type == "rabit"){
            adoptedAnimal = new Rabit();
            this.Id+=1;
        }else{
            System.out.println("Invalid Pet Type!!");
        }
        if(adoptedAnimal!=null){
            this.pets.put(this.Id, adoptedAnimal);
            return this.Id;
        }
        return -1;
    }
    public IAnimal getPet(int id){
        return this.pets.get(id);
    }
    
}
