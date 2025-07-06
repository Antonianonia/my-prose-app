/*
 * This file is part of My Prose App.
 *
 * Copyright (C) 2025 Antonia Middeldorf
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *
 * SPDX-License-Identifier: GPL-3.0-only
 */

package de.htw_berlin;

import java.util.List;
import java.util.stream.Collectors;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleProse implements Prose {
    private final List<Sentence> sentences;

    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String get() {
        return sentences.stream()
                .map(Sentence::get)
                .collect(Collectors.joining(" "));
    }
    
}