public class Wilder {
    
public String firstName;
public boolean aware;

public Wilder(String firsname, boolean aware){
    this.firstName = firsname;
    this.aware = aware;
}

public String whoAmi(){
    if(this.aware == true){
        return "Je m'appelle " + this.firstName + " et je suis aware";

    }
    else{
        return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
    }
}



}
