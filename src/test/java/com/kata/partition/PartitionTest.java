package com.kata.partition;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * @author ALLOUM Abderrahim on 21/05/2020
 * @project partition-kata
 */
public class PartitionTest {

    private Partition partition = new Partition();

    @Test
    public void givenListToSplitIntoNSublists() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<List<Integer>> subSets = partition.partition(numbers,3);

        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = Arrays.asList(7, 8);

        assertThat(subSets.size()).isEqualTo(3);
        assertThat(lastPartition).isEqualTo(expectedLastPartition);
    }
}
