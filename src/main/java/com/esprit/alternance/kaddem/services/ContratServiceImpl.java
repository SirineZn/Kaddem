package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;
import com.esprit.alternance.kaddem.entities.Universite;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@AllArgsConstructor
@Service
@Slf4j
public class ContratServiceImpl implements IContratService {
    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }

    //@Scheduled(cron = "0 0 13 * * *")
  // @Scheduled(cron = "*/60 * * * * *")
   // public void retrieveAndUpdateStatusContrat() {
     //   List<Contrat> contratList;
     //   contratList = contratRepository.findAll();
      //  Date limitDate = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);

      //  contratList.stream().filter(
              //  contrat -> {
                 //   if(limitDate.getTime()-contrat.getDateFinContrat().getTime()>0)
                   //     return true;
                   // return false;
           //     }
       // ).forEach(
         //       contrat -> log.info("THIS CONTRAT ID: "+contrat.getIdContrat()+" WILL BE END IN "+contrat.getDateFinContrat())
      //  );

    //}
    @Scheduled(cron = "* * * * * *")
    public void retrieveAndUpdateStatusContrat() {
        // date variable va contenir le current date
        Date date =new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);
        //long noOfMonths = ChronoUnit.MONTHS.between(startMonth, endMonth)+1
        List<Contrat> contrats =contratRepository.findByDateFinContratBeforeAndArchiveIsFalse(date);
        //on doit parcourir la liste des contarts
        //parcourir les contarts expirés dont la validité n'atteint pas encore la date limite du contrat et ne sont pas archivés
        contrats.stream().filter(new Predicate<Contrat>() {
            @Override
            public boolean test(Contrat contrat) {
                if(date.getTime()-contrat.getDateFinContrat().getTime()>0)
                return true;
                else return false;
            }
        }).forEach(new Consumer<Contrat>() {
            @Override
            public void accept(Contrat contrat) {
                log.info(" Le contrat de l'etudiant : "+contrat.getEtudiant().getNomE()+" dont l'id du contrat est "+contrat.getIdContrat()+" va expirer le "+contrat.getDateFinContrat());
            }
        });

    }

}
