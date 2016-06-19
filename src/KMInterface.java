import java.io.File;

/* Import our Clustering Libraries */
import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.core.Dataset;
import net.sf.javaml.tools.data.FileHandler;

public class KMInterface {

    public static void main(String[] args) throws Exception {

        /* Load a dataset */
        Dataset data = FileHandler.loadDataset(new File("C:/Users/michael/Dropbox/K-Means Java Documentation/data sets/iris.data"), 4, ",");
        
        /* Create a new instance of the KMeans algorithm */       
        Clusterer km = new KMeans();
        
        /* Cluster the data, it will be returned as an array of data sets, with each dataset representing a cluster */
        Dataset[] clusters = km.cluster(data);
        
        /* Print the cluster count */
        System.out.println("Cluster count: " + clusters.length);
        
        /* Print the clustered data of each cluster */
        for (int i = 0; i < clusters.length ; i++){
            System.out.println(clusters[i]);
        }
    }
}

