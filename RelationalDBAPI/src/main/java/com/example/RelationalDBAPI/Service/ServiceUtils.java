package com.example.RelationalDBAPI.Service;

import com.example.RelationalDBAPI.DbModel.NetflixShow;
import com.example.RelationalDBAPI.Model.RequestObjectSearch;
import com.example.RelationalDBAPI.Model.RequestObjectShow;
import com.example.RelationalDBAPI.Model.ResponseObjectShow;
import com.example.RelationalDBAPI.Model.Show;
import com.example.RelationalDBAPI.Repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceUtils {
    @Autowired
    ShowRepository showRepository;
    @Autowired Reader r;
    List<Show> shows = r.readFromCSV("C:\\Users\\subhodghosh\\RelationalDBAPI\\src\\main\\resources\\netflix_titles.csv");

    public void saveShows(RequestObjectShow show) {
        int flag = 0;
        for(Show s : shows){
            if(s.getTitle().equalsIgnoreCase(show.getTitle())){
                flag = 1;
                break;
            }
        }
        if(flag!=1){
            NetflixShow showDb = new NetflixShow();
            if(null != show.getTitle()){
                showDb.setShowTitle(show.getTitle());
            }
            if(null != show.getCast()){
                showDb.setShowCast(show.getCast());
            }
            if(null != show.getCountry()){
                showDb.setShowCountry(show.getCountry());
            }
            if(null != show.getDateAdded()){
                showDb.setShowDateAdded(show.getDateAdded());
            }
            if ((null != show.getDescription())){
                showDb.setShowDescription(show.getDescription());
            }
            if ((null != show.getDirector())){
                showDb.setShowDirector(show.getDirector());
            }
            if(null != show.getDuration()){
                showDb.setShowDuration(show.getDuration());
            }
            if(null != show.getListedIn()){
                showDb.setShowListedIn(show.getListedIn());
            }
            if ((null != show.getReleaseYear())){
                showDb.setShowReleaseYear(show.getReleaseYear());
            }
            if ((null != show.getRating())){
                showDb.setShowRating(show.getRating());
            }
            showRepository.save(showDb);
            System.out.println("SAVED");
        }
    }

    public ResponseObjectShow getResources(RequestObjectSearch show) {
        ResponseObjectShow responseObjectShow = new ResponseObjectShow();
        List<NetflixShow> showsDb = showRepository.findAll();
        for(Show s : shows){
            if(s.getTitle().equalsIgnoreCase(show.getTitle())){
                responseObjectShow.setMessage("From CSV file");
                break;
            }
        }
        for(NetflixShow s :showsDb){
            if(s.getShowTitle().equalsIgnoreCase(show.getTitle())){
                responseObjectShow.setMessage("From DB file");
                break;
            }
        }
        return responseObjectShow;
    }
}
