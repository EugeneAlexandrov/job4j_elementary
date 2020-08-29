package ru.job4j.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.averagingInt(Subject::getScore));
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(s -> new Tuple(s.getName(), s.getSubjects()
                .stream()
                .collect(Collectors.averagingInt(Subject::getScore))
        ))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        Map<String, IntSummaryStatistics> subjects = stream
                .flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summarizingInt(Subject::getScore)));
        return subjects.entrySet().stream()
                .map(m -> new Tuple(m.getKey(), m.getValue().getAverage()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(x ->
                new Tuple(x.getName(), x.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .reduce(0, Integer::sum)))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        Map<String, Integer> subjects = stream
                .flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingInt(Subject::getScore)));
        return subjects.entrySet().stream()
                .map(m -> new Tuple(m.getKey(), m.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }
}
