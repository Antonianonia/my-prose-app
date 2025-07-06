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

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleSentence implements Sentence{
    String sentence;

    /**
     * Constructs a SimpleSentence object.
     */
    public SimpleSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    /**
     * Returns a simple sentence.
     *
     * @return A string representing a simple sentence.
     */
    public String get() {
        return this.sentence;
    }
}