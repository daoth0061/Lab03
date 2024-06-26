package hust.soict.dsai.aims.media.comparator;

import hust.soict.dsai.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        Double cost1 = (double) o1.getCost();
        Double cost2 = (double) o2.getCost();
        int comp = cost1.compareTo(cost2);
        if (comp != 0) {
            return comp;
        } else {
            String title1 = o1.getTitle();
            String title2 = o2.getTitle();
            return title1.compareTo(title2);
        }
    }
}
