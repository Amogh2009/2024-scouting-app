package com.example.scoutingapp;

public class Match {
    String scout_namev;
    String match_numberv;
    String team_numberv;
    String alliance_colorv;
    int ground_pickup_autonv;
    int ground_pickup_teleopv;
    int source_pickup_autonv;
    int source_pickup_teleopv;
    int speaker_autonv;
    int speaker_teleopv;
    int amplified_speaker_teleopv;
    int total_speaker_autonv;
    int total_speaker_teleopv;
    int amp_autonv;
    int amp_teleopv;
    int dropv;
    String source_to_speaker;
    String spotlightv;
    String buddy_climbv;
    String trapv;
    String onstagev;
    String listv;
    int shots_blockedv;
    int blocksv;
    int times_they_blockedv;
    int total_failsv;
    int preloadv;

    public Match(String scoutNamev, String matchNumberv, String teamNumberv, String allianceColorv, int Preloadv, int groundPickupAutonv, int groundPickupTeleopv, int sourcePickupAutonv, int sourcePickupTeleopv, int speakerAutonv, int speakerTeleopv, int amplifiedSpeakerTeleopv, int totalSpeakerAutonv, int totalSpeakerTeleopv, int ampAutonv, int ampTeleopv, int Dropv, int shotsBlockedv, int timesTheyBlockedv, int totalFailsv, String sourceToSpeaker, String Spotlightv, String buddyClimbv, String Trapv, String Onstagev, String Listv) {
        scout_namev = scoutNamev;
        match_numberv = matchNumberv;
        team_numberv = teamNumberv;
        alliance_colorv = allianceColorv;
        preloadv = Preloadv;
        ground_pickup_autonv = groundPickupAutonv;
        ground_pickup_teleopv = groundPickupTeleopv;
        source_pickup_autonv = sourcePickupAutonv;
        source_pickup_teleopv = sourcePickupTeleopv;
        speaker_autonv = speakerAutonv;
        speaker_teleopv = speakerTeleopv;
        amplified_speaker_teleopv = amplifiedSpeakerTeleopv;
        total_speaker_autonv = totalSpeakerAutonv;
        total_speaker_teleopv = totalSpeakerTeleopv;
        amp_autonv = ampAutonv;
        amp_teleopv = ampTeleopv;
        dropv = Dropv;
        shots_blockedv = shotsBlockedv;
        times_they_blockedv = timesTheyBlockedv;
        total_failsv = totalFailsv;
        source_to_speaker = sourceToSpeaker;
        spotlightv = Spotlightv;
        buddy_climbv = buddyClimbv;
        trapv = Trapv;
        onstagev = Onstagev;
        listv = Listv;
    }
}
