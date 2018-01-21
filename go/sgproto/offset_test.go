package sgproto

import (
	"testing"
	time "time"

	"github.com/stretchr/testify/require"
)

func TestOffset(t *testing.T) {
	this := NewOffset(13, time.Now().Round(time.Millisecond).UTC())

	b, err := this.Marshal()
	require.NoError(t, err)

	var that Offset
	err = that.Unmarshal(b)
	require.NoError(t, err)

	require.Equal(t, this.Index(), that.Index())
	require.Equal(t, this.Time(), that.Time())
	require.True(t, this.Equal(that))

	//

	o1 := NewOffset(0, time.Unix(1000, 0))
	o2 := NewOffset(0, time.Unix(500, 0))

	require.True(t, o1.After(o2))
	require.True(t, o2.Before(o1))

	o1 = NewOffset(0, time.Unix(500, 0))
	require.True(t, o1.Equal(o2))
}
