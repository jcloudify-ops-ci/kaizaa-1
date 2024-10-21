package fr.univr.lim.file;

import fr.univr.lim.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
