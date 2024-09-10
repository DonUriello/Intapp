package eu.project.intapp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Util {

    public static List<String> split(String strIn) {
        if(strIn == null) return new ArrayList<>();

        List<String> split          = List.of(strIn.split(","));
        List<String> listToRemove   = new ArrayList<>();
        List<String> listToAdd      = new ArrayList<>();

        for(String s : split) {
            String separator = " ";
            if(s.contains(separator)) {
                listToRemove.add(s);
                listToAdd = Arrays.asList(s.split(separator));
            }
        }

        for(String s : split) {
            List<String> tempSplitted = new ArrayList<>();
            tempSplitted = List.of(s.split(";"));
            split.addAll(tempSplitted);
        }
        return split;
    }



}
