package Scenarios;

import java.io.*;
import java.util.*;

class Candidates
{
    String name;
    int age;
    String locality;
    public Candidates(String name,String locality,int age){
        this.name = name;
        this.locality = locality;
        this.age = age;
    }
}

class Interview_Candidates
{
    boolean areNatives(ArrayList<Candidates> candidatesList)
    {
        int aNative = (int)candidatesList.stream().filter((c) ->
                c.locality.equals("Native")).count();
        return aNative == candidatesList.size();

    }

    Candidates youngestCandidate(ArrayList<Candidates> candidatesList)
    {
        candidatesList.sort(Comparator.comparingInt(o -> o.age));
        return candidatesList.get(0);

    }
}
public class CandidateStream
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Candidates> candidatesList=new ArrayList<>();

        int n=Integer.parseInt(br.readLine().trim());

        for(int i=0;i<n;i++)
        {
            String inp=br.readLine();
            String[] strings =inp.split("-");

            Candidates cnd=new Candidates( strings[0], strings[1], Integer.parseInt(strings[2]) );
            candidatesList.add(cnd);
        }

        Interview_Candidates ic=new Interview_Candidates();

        boolean ans= ic.areNatives(candidatesList);
        if(ans)
            System.out.println("All candidates are Natives");
        else
            System.out.println("All candidates are not Natives");

        Candidates youngest=ic.youngestCandidate(candidatesList);

        System.out.println("Details of the Candidate with youngest age : Name = "+youngest.name+", Locality = "+youngest.locality+", Age = "+youngest.age);
    }
}