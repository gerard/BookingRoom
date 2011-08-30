/**
   Copyright: 2011 Android Aalto

   This file is part of BookingRoom.

   BookingRoom is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   BookingRoom is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with BookingRoom. If not, see <http://www.gnu.org/licenses/>.
 */

package org.androidaalto.bookingroom.logic;

import android.text.format.Time;

/**
 * @author hannu
 */
public class MeetingInfo {
    private final UserInfo user;
    private final Time start;
    private final Time end;
    private final String title;

    public MeetingInfo(UserInfo user, Time start, Time end, String title) {
        this.user = user;
        this.start = start;
        this.end = end;
        this.title = title;
    }

    public UserInfo getUser() {
        return user;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }

    public String getTitle() {
        return title;
    }
}
