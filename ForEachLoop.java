public class ForEachLoop 
{
    public static void main(String[] args) 
    {
        String [] members = {"Maher","Affan","Taseen","Tauseef","Tamim","Anas","Khalil"};

        for (String member : members)
        {
            System.out.println("Sending reminder email to "+ member + ". Please, return your overdue books to the library as soon as possible");
        }
    }
    
}
