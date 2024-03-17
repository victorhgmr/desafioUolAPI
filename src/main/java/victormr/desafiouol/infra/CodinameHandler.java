package victormr.desafiouol.infra;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import victormr.desafiouol.model.GroupType;
import victormr.desafiouol.service.CodinameService;

import java.util.Collections;

@Component
public class CodinameHandler {

    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVANGERS){
            Collections.shuffle(service.getAvangersCodinameList());
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }else {
            Collections.shuffle(service.getJusticeLeagueList());
            String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
            this.service.getJusticeLeagueList().remove(firstMatch);
            return firstMatch;
        }
    }
}
