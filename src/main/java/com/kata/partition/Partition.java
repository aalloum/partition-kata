package com.kata.partition;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author ALLOUM Abderrahim on 21/05/2020
 * @project partition-kata
 */
public class Partition {

    /***
     *
     * @param listToSplit liste d'entree
     * @param taille  taille de la sous liste cible
     * @return Les listes partitionees
     */
    public List<List<Integer>> partition(List<Integer> listToSplit, int taille) {
        AtomicInteger counter = new AtomicInteger();
        Collection<List<Integer>> result = listToSplit.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / taille))
                .values();
        return new ArrayList(result);
    }

}
