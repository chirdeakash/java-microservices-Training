package com.pension.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class PensionService {
    @Autowired
    PensionRepository pensionRepository;
    public String save(Pension pension){
        pensionRepository.save(pension);
        return "saved";
    }
    public String checkStatus(int id){
        return  pensionRepository.getPensionStatus(id);


    }
    public String checkBalance(int id){
        return  pensionRepository.getBalance(id);

    }
    public String checkApplication(int id){
        return  pensionRepository.findById(id).get().toString();
    }
    public void issuepension(){
        pensionRepository.issuePension("R","Y",getCurrentMMYY("MMyy"),getPreviousMMYY());

    }

    private static String getPreviousMMYY() {
        String currentMonth = getCurrentMMYY("MM");
        String currentYear = getCurrentMMYY("yy");

        //previous MMYY
        int prevMonth = Integer.parseInt(currentMonth)-1;
        String previousMMYY = String.valueOf(prevMonth)+currentYear;
        if(previousMMYY.length()==3) {
            previousMMYY = "0" + previousMMYY;
        }
        return previousMMYY;
    }

    private static String getCurrentMMYY(String MMyy) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MMyy);
        String currentMMYY = simpleDateFormat.format(new Date());
        return currentMMYY;
    }

    public void loadpension() {
        pensionRepository.loadPension("A","N",getCurrentMMYY("MMyy"),getPreviousMMYY());

    }

    public Pension getApplicantById(int id)
    {
        return pensionRepository.findById(id).get();
    }

}