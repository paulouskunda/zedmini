package com.zedmini.lib;

public class ZedMiniImpl implements ZedMini{
    @Override
    public String nrcFormatter(String unFormatterNRC) {
        try {
            return formatNRC(unFormatterNRC);
        }catch (Exception exception){
            return exception.getMessage();
        }
    }

    private String formatNRC(String unFormatterNRC) throws Exception{
        if (unFormatterNRC.length() == 9){
            String upperBoundCharacters = unFormatterNRC.substring(0, 6);
            String getTheLastCharacters = unFormatterNRC.substring(6,8);
            StringBuilder stringBuilder = new StringBuilder();
            String formattedNrc = String.valueOf(stringBuilder.append(upperBoundCharacters)
                                    .append("/").append(getTheLastCharacters).append("/")
                                    .append(unFormatterNRC.charAt(8)));
            return formattedNrc;
        }else {
            throw new Exception("NRC Length should be exactly 9 characters");
        }

    }
}
