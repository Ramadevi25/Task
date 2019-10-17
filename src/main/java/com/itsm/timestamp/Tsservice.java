package com.itsm.timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Tsservice {

    @Autowired
    Tsrepository tsrepository;

    public String timestampost(Tsclassrequest tsclassrequest)
    {
        Tsclass obj=new Tsclass();

        long epochtime=tsclassrequest.getTimestamp();
        long dateInMillisecs = new Date().getTime()/1000;
        long diff=dateInMillisecs-epochtime;
        if(diff < 300)
        {
            obj.setTimestamp(tsclassrequest.getTimestamp());
            tsrepository.save(obj);
            return "valid request";
        }
//        else
//        {
//            System.out.println("inside else");
//            String opertion=tsclass1.getOperation();
//            if(opertion.equals("create"))
//            {
//                //save it in repository
//            }
//            else if (opertion.equals("delete"))
//            {
                long timestamp=tsclassrequest.getTimestamp();
                tsrepository.delete(obj);
//                //delete from repository
//
//            }
//            else
//            {
//                //get update values and update
//            }
//            return "late request";
//        }
//
//
return "late request";
    }

}
