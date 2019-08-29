class emp
{ private int empid;
  private double empbasicsal;
  private double emphra, empda, empit;
  emp()
  { empid=0; empbasicsal=0; emphra=0; empda=0; empit=0;
  }
  
  emp(int id, double bsal, double hra, double da, double it)
  { empid=id;
    empbasicsal=bsal;
    emphra=hra;
    empda=da;
    empit=it;
  }
  
  double calculate ()
  { double gross;
    gross=empbasicsal+(empbasicsal*emphra)+(empbasicsal*empda)-(empbasicsal*empit);
    return gross;
  }

  void setdata(int id, double bsal, double hra, double da, double it)
  { empid=id;
    empbasicsal=bsal;
    emphra=hra;
    empda=da;
    empit=it;
  }
}

class empmain
{ 
  public static void main(String args[])
  { emp e1=new emp();
    emp e2=new emp(11, 20010.567,50.257, 0.90, 1.20);
    double g= e2.calculate();
    System.out.println("Gross salary of Employee 2 is: "+g);
    e1.setdata(10,39216.567,75.657,0.80,0.90);
    double g1= e1.calculate();
    System.out.println("Gross Salary of Employee 1: "+g1);
  }
}
