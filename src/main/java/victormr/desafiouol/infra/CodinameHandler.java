package victormr.desafiouol.infra;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import victormr.desafiouol.model.GroupType;
import victormr.desafiouol.service.CodinameService;

import java.util.Collections;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVANGERS) {
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;

    }
}
