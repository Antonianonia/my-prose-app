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

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        // Create sentences
        Sentence sentence1 = new SimpleSentence("This is the first sentence.");
        Sentence sentence2 = new SimpleSentence("Here is the second sentence.");
        Sentence sentence3 = new SimpleSentence("Finally, this is the third sentence.");

        // Create a prose object with the sentences
        Prose prose = new SimpleProse(List.of(sentence1, sentence2, sentence3));

        // Print the prose
        System.out.println(prose.get());
    }
}