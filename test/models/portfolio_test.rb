require 'test_helper'

class PortfolioTest < ActiveSupport::TestCase
  # test "the truth" do
  #   assert true
  # end

  test 'should save portfolio record' do
    portfolio = Portfolio.new

    assert portfolio.save

  end

end
