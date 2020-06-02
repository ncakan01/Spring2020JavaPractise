package HomeWork;

public class Offer {
    /*
    1. Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers
     */
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo(String location , String company , double salary , boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }
    public String toString(){
        return "location: "+location+", company: "+ company+", salary: "+salary+", is full time: "+isFullTime;
    }

}
