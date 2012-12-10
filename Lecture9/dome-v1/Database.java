import java.util.ArrayList;
import java.util.Iterator;

/**
 * The database class provides a facility to store CD and video 
 * objects. A list of all CDs and videos can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2002-05-02
 */
public class Database
{
    private ArrayList cds;
    private ArrayList videos;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        cds = new ArrayList();
        videos = new ArrayList();
    }

    /**
     * Add a CD to the database.
     */
    public void addCD(CD theCD)
    {
        cds.add(theCD);
    }

    /**
     * Add a video to the database.
     */
    public void addVideo(Video theVideo)
    {
        videos.add(theVideo);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(Iterator iter = cds.iterator(); iter.hasNext(); ) {
            CD cd = (CD)iter.next();
            cd.print();
            System.out.println();   // empty line between items
        }

        // print list of videos
        for(Iterator iter = videos.iterator(); iter.hasNext(); ) {
            Video video = (Video)iter.next();
            video.print();
            System.out.println();   // empty line between items
        }
    }
}
