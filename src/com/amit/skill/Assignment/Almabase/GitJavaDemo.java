package com.amit.skill.Assignment.Almabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amit on 1/2/17.
 */
public class GitJavaDemo {
    public static void main(String args[]){
        String username="amit---kumar";
        String password="Camit@14";
        String url="https://api.github.com/orgs/glassbeam/repos?type=private";
        String[] command = {"curl", "-H", "Accept:application/json", "-u", username+":"+password , url};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try
        {
            p = process.start();
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            Pattern repoName=Pattern.compile("\"full_name\":\\s+\"([^\"]+).*");
            Pattern forkCount=Pattern.compile("\"forks_count\":\\s+(\\d+).*");
            Pattern contributors=Pattern.compile("\"contributors_url\":\\s+\"([^\"]+).*");

            Matcher repoNameMatch;
            Matcher forkCountMatch;
            Matcher contributorsMatch;


            List<Repo> repoList=new ArrayList<>();
            String repoNametemp=null;
            String contributorstemp=null;
            int forkCounttemp=-1;

            while ( (line = reader.readLine()) != null) {
                builder.append(line);

                repoNameMatch=repoName.matcher(line);
                if(repoNameMatch.find()){
                   // System.out.println(repoNameMatch.group(1));
                    repoNametemp=repoNameMatch.group(1);
                }

                contributorsMatch=contributors.matcher(line);
                if(contributorsMatch.find()){
                    //System.out.println(contributorsMatch.group(1));
                    contributorstemp=contributorsMatch.group(1);
                }

                forkCountMatch=forkCount.matcher(line);
                if(forkCountMatch.find()){
                    //System.out.println(forkCountMatch.group(1));
                    forkCounttemp= Integer.parseInt(forkCountMatch.group(1));

                }

                if(repoNametemp!=null && contributorstemp !=null && forkCounttemp!=-1){
                    Repo newRepo=new Repo(repoNametemp,contributorstemp,forkCounttemp);
                    repoList.add(newRepo);
                    repoNametemp=null;
                    contributorstemp=null;
                    forkCounttemp=-1;
                }
                builder.append(System.getProperty("line.separator"));

            }

            String result = builder.toString();
            //System.out.print(result);
            Collections.sort(repoList);
            List<Repo> topFiveRepo=new ArrayList<>();
            int count=5;
            for (Repo r: repoList) {
                //System.out.println(r.repoName+" "+r.contributors+" "+r.forkCount);
                if (count-->0){
                    topFiveRepo.add(r);
                }
            }

            System.out.println("top 5 most popular repositories of a firm based on the number of forks");
            for (Repo r: topFiveRepo) {
                System.out.println("\t"+r.repoName+" "+r.contributors+" "+r.forkCount);
                contrib(r.getContributors());
            }

        }
        catch (IOException e)
        {   System.out.print("error");
            e.printStackTrace();
        }
    }

    public static void contrib(String url) throws IOException {
        String username = "amit---kumar";
        String password = "Camit@14";
        String[] command = {"curl", "-H", "Accept:application/json", "-u", username + ":" + password, url};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;

            Pattern login=Pattern.compile("\"login\":\\s+\"([^\"]+).*");
            Pattern contributions=Pattern.compile("\"contributions\":\\s+(\\d+).*");

            Matcher loginMatch;
            Matcher contributionsMatch;

            List<Committee> committeeList=new ArrayList<>();
            String loginMatchtemp=null;
            int contributionsMatchtemp=-1;

            while ((line = reader.readLine()) != null) {

                loginMatch=login.matcher(line);
                if(loginMatch.find()){
                    //System.out.println(loginMatch.group(1));
                    loginMatchtemp=loginMatch.group(1);
                }


                contributionsMatch=contributions.matcher(line);
                if(contributionsMatch.find()){
                    //System.out.println(contributionsMatch.group(1));
                    contributionsMatchtemp= Integer.parseInt(contributionsMatch.group(1));

                }

                if(loginMatchtemp!=null && contributionsMatchtemp!=-1){
                    Committee newCommittee=new Committee(loginMatchtemp,contributionsMatchtemp);
                    committeeList.add(newCommittee);
                    loginMatchtemp=null;
                    contributionsMatchtemp=-1;
                }

                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();
            //System.out.print(result);
            Collections.sort(committeeList);
            List<Committee> topCommittee=new ArrayList<>();
            int count=5;
            for (Committee c: committeeList) {
                if (count-->0){
                    topCommittee.add(c);
                }
            }

            System.out.println("\t\ttop 3 committees and their commit count");
            for (Committee c:topCommittee) {
                System.out.println("\t\t\t"+c.committeeName+" "+c.commitCount);
            }

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
    }
}

class Repo implements Comparable<Repo>{
    String repoName;
    String contributors;
    int forkCount;
    Repo(String repoName, String contributors, int forkCount){
        this.repoName=repoName;
        this.contributors=contributors;
        this.forkCount=forkCount;
    }

    public String getContributors(){
        return contributors;
    }

    public int compareTo(Repo repo) {
        return repo.forkCount-this.forkCount;
    }

}

class Committee implements Comparable<Committee>{

    String committeeName;
    int commitCount;

    Committee(String committeeName, int commitCount){
        this.committeeName=committeeName;
        this.commitCount=commitCount;
    }

    @Override
    public int compareTo(Committee committee) {
        return committee.commitCount-this.commitCount;
    }
}