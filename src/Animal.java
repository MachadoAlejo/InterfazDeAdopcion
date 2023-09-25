public class Animal {
    //Defininiendo propiedades

    String species;
    String race;
    String animalName;
    int age;
    String healthStatus;
    String description;

    //Constructor vacio


    //Constructor con atributos definidos


    public Animal(String species, String race, String name, int age, String healthStatus, String description) {
        this.species = species;
        this.race = race;
        this.animalName = name;
        this.age = age;
        this.healthStatus = healthStatus;
        this.description = description;
    }

    //Getters and Setters


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void mostrarInformacion () {
        System.out.println("Informacion del animal: ");
        System.out.println("Especie: " + species);
        System.out.println("Raza: " + race);
        System.out.println("Nombre: " + animalName);
        System.out.println("Edad: " + age);
        System.out.println("Estado de salud: " + healthStatus);
        System.out.println("Descripcion: " + description);
    }
}

